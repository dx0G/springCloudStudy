package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: guodx
 * @Date: 2020/10/10 9:13 上午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527Application.class, args);
    }
}
