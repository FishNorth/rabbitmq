package com.bim5d.glodon.sercvice;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: guanl-c
 * @date: 2019/4/24 11:20
 * @description:
 */
@Service
public class MessageService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendTopicMessage() {
        amqpTemplate.convertAndSend("topicExchange", "topic.message", "向A队列发送一条消息");
        amqpTemplate.convertAndSend("topicExchange", "topic.D.F", "向队列发送一条消息");
    }

    public void sendFanoutMessage() {
        amqpTemplate.convertAndSend("fanoutExchange", "", "测试fanout模式发送消息，所有监听fanoutExchange路由器的消费者都会收到该消息！");
    }

    public void sentDirectMessage() {
        amqpTemplate.convertAndSend("hello", TimeUnit.SECONDS);
    }
}
