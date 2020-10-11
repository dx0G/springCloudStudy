package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: guodx
 * @Date: 2020/10/11 8:18 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrder83Application {
    public static void main(String[] args){
        SpringApplication.run(NacosOrder83Application.class, args);
    }
}
