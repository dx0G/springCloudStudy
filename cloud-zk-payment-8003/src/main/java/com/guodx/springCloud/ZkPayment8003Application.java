package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: guodx
 * @Date: 2020/9/29 8:36 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkPayment8003Application {
    public static void main(String[] args) {
        SpringApplication.run(ZkPayment8003Application.class);
    }
}
