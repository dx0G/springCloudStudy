package com.guodx.springCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:29 上午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.guodx.springCloud.dao")
public class EurekaPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPayment8001Application.class, args);
    }
}
