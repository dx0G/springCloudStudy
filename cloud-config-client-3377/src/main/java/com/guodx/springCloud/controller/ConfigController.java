package com.guodx.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guodx
 * @Date: 2020/10/10 5:45 下午
 * @Description:
 * @Version: 1.0
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String info;
    @Value("${server.port}")
    private int port;


    @GetMapping("/configInfo")
    public String configInfo() {
        return port + "," + info;
    }
}
