package com.guodx.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: guodx
 * @Date: 2020/10/11 8:19 下午
 * @Description:
 * @Version: 1.0
 */
@Configuration
public class OrderConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
