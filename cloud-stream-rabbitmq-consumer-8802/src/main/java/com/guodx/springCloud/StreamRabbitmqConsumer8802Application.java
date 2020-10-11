package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: guodx
 * @Date: 2020/10/11 12:02 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
// 不写@EnableEurekaClient可以不写 也会注册
public class StreamRabbitmqConsumer8802Application {
    public static void main(String[] args){
        SpringApplication.run(StreamRabbitmqConsumer8802Application.class, args);
    }
}
