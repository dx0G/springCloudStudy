package com.guodx.springCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: guodx
 * @Date: 2020/10/11 8:20 下午
 * @Description:
 * @Version: 1.0
 */
@RestController
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(serviceUrl + "/payment/nacos/" + id, String.class);
    }
}
