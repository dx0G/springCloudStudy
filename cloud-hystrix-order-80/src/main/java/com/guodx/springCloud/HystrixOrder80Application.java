package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: guodx
 * @Date: 2020/10/8 8:51 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrder80Application.class);
    }
}
