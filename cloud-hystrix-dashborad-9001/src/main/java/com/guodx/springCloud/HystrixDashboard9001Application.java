package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: guodx
 * @Date: 2020/10/9 9:52 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001Application.class, args);
    }

}
