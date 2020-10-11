package com.guodx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: guodx
 * @Date: 2020/10/10 4:56 下午
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenter3344Application {

    public static void main(String[] args){
        SpringApplication.run(ConfigCenter3344Application.class, args);
    }
}
