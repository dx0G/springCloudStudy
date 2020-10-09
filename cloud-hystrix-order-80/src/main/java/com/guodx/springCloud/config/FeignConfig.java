package com.guodx.springCloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: guodx
 * @Date: 2020/10/8 9:27 下午
 * @Description:
 * @Version: 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level loggerLevel() {
        return Logger.Level.FULL;
    }
}
