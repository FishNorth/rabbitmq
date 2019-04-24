package com.bim5d.glodon.controller;

import com.bim5d.glodon.sercvice.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: guanl-c
 * @date: 2019/3/23 14:30
 * @description:
 */
@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/message/send")
    public String sendMessage() {
        messageService.sendTopicMessage();
        return "send message success";
    }
}
