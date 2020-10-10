package com.guodx.springCloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:36 上午
 * @Description:
 * @Version: 1.0
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/ok")
    public String ok() {
        return "ok," + Thread.currentThread().getName();
    }

    @HystrixCommand(fallbackMethod = "timeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    @GetMapping("/timeout")
    public String timeout() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout," + Thread.currentThread().getName();
    }

    public String timeoutHandler() {
        return "o(╥﹏╥)o,系统繁忙,请稍后重试," + Thread.currentThread().getName();
    }

    @HystrixCommand(fallbackMethod = "breakerFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),              //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),    //请求数达到后才计算
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //休眠时间窗
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),  //错误率达到多少跳闸
    })
    @GetMapping("/breaker/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("id不能为负数");
        }
        return "服务调用成功,返回流水号:" + UUID.randomUUID().toString();
    }

    public String breakerFallback(@PathVariable("id") Integer id) {
        return "id:" + id + "不能为负数,请重试,o(╥﹏╥)o";
    }

}
