package com.guodx.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Author: guodx
 * @Date: 2020/10/11 12:03 下午
 * @Description:
 * @Version: 1.0
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private int port;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者" + port + ",接收到消息:" + message.getPayload());
    }
}
