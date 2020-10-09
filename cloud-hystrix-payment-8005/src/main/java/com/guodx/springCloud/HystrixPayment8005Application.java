package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @Author: guodx
 * @Date: 2020/10/8 9:40 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixPayment8005Application {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPayment8005Application.class);
    }
}
