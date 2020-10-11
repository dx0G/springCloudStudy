package com.guodx.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guodx
 * @Date: 2020/10/11 8:10 下午
 * @Description:
 * @Version: 1.0
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry,server port:" + port + "\t,id:" + id;
    }
}
