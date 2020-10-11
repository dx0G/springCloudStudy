package com.guodx.springCloud.controller;

import com.guodx.springCloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guodx
 * @Date: 2020/10/11 11:26 上午
 * @Description:
 * @Version: 1.0
 */
@RestController
public class MessageController {
    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public void sendMessage() {
        messageProvider.send();
    }
}
