package com.guodx.springCloud.controller;

import com.guodx.springCloud.feign.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:44 上午
 * @Description:
 * @Version: 1.0
 */
@RestController
//@DefaultProperties(defaultFallback = "timeoutHandler")
public class OrderController {

    @Autowired
    private PaymentService paymentService;


    @GetMapping("/consumer/payment/ok")
    public String ok() {
        return paymentService.ok();
    }

    // 方法级别的
//    @HystrixCommand(fallbackMethod = "timeoutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
//    @HystrixCommand
    @GetMapping("/consumer/payment/timeout")
    public String timeout() {
        return paymentService.timeout();
    }

    public String timeoutHandler() {
        return "o(╥﹏╥)o,调用方繁忙,请稍后重试," + Thread.currentThread().getName();
    }
}
