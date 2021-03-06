package com.guodx.springCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:44 上午
 * @Description:
 * @Version: 1.0
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private final String PAYMENT_URL = "http://cloud-consul-payment-service";

    @GetMapping("/consumer/payment/consul")
    public String getPaymentWithConsul() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul/", String.class);
    }
}
