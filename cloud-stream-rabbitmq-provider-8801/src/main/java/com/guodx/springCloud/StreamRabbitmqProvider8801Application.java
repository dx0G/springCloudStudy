package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: guodx
 * @Date: 2020/10/11 11:20 上午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitmqProvider8801Application {
    public static void main(String[] args){
        SpringApplication.run(StreamRabbitmqProvider8801Application.class, args);
    }
}
