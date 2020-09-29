package com.guodx.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/consul")
    public String paymentWithConsul() {
        return "查询成功,port:" + port + "|" + UUID.randomUUID();
    }
}
