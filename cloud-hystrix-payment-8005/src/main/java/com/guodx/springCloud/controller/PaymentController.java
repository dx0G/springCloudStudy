package com.guodx.springCloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "ok,"+Thread.currentThread().getName();
    }

    @HystrixCommand(fallbackMethod = "timeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    @GetMapping("/timeout")
    public String timeout() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout,"+Thread.currentThread().getName();
    }

    public String timeoutHandler() {
        return "o(╥﹏╥)o,系统繁忙,请稍后重试,"+Thread.currentThread().getName();
    }
}
