package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:45 上午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80Application.class, args);
    }
}
