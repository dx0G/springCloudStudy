package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: guodx
 * @Date: 2020/10/11 8:09 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPayment9001Application {
    public static void main(String[] args){
        SpringApplication.run(NacosPayment9001Application.class, args);
    }
}
