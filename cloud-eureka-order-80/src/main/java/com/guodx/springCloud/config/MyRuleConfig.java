package com.guodx.springCloud.config;

import com.guodx.springCloud.rule.MyRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: guodx
 * @Date: 2020/10/8 8:28 下午
 * @Description:
 * @Version: 1.0
 */
@Configuration
public class MyRuleConfig {

    @Bean
    public IRule myRule() {
        return new MyRule();
    }
}
