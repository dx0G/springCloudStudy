package com.guodx.springCloud.controller;

import com.guodx.springCloud.entities.CommonResult;
import com.guodx.springCloud.feign.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:44 上午
 * @Description:
 * @Version: 1.0
 */
@RestController
public class OrderController {

    @Autowired
    private PaymentService paymentService;


    @GetMapping("/consumer/payment/getById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getById(id);
    }

    @GetMapping("/consumer/timeout")
    public Integer FeignTimout() {
        return paymentService.feignTimout();
    }
}
