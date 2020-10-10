package com.guodx.springCloud;

import com.guodx.springCloud.config.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:45 上午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-eureka-payment-service", configuration = MyRuleConfig.class)
public class EurekaOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaOrder80Application.class, args);
    }
}
