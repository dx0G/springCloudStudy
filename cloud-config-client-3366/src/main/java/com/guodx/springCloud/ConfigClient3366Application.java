package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: guodx
 * @Date: 2020/10/10 5:41 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3366Application {
    public static void main(String[] args){
        SpringApplication.run(ConfigClient3366Application.class, args);
    }
}
