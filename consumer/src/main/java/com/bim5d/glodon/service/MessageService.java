package com.bim5d.glodon.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: guanl-c
 * @date: 2019/4/24 13:49
 * @description:
 */
@Component
public class MessageService {

    @RabbitListener(queues = "hello")
    public void hello(String str1) {
        System.out.println("hello: " + str1);
    }

    @RabbitListener(queues = "fanout.A")
    public void processA(String str1) {
        System.out.println("ReceiveA:" + str1);
    }

    @RabbitListener(queues = "fanout.B")
    public void processB(String str) {
        System.out.println("ReceiveB:" + str);
    }

    @RabbitListener(queues = "fanout.C")
    public void processC(String str) {
        System.out.println("ReceiveC:" + str);
    }

    @RabbitListener(queues = "topicA")    //监听器监听指定的Queue
    public void process1(String str) {
        System.out.println("queueMessageA:" + str);
    }

    @RabbitListener(queues = "topicB")    //监听器监听指定的Queue
    public void process2(String str) {
        System.out.println("queueMessageB:" + str);
    }
}
