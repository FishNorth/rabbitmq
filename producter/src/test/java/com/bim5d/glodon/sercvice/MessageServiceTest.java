package com.bim5d.glodon.sercvice;

import com.bim5d.glodon.ProducterApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: guanl-c
 * @date: 2019/4/24 13:57
 * @description:
 */
@SpringBootTest(classes = ProducterApplication.class)
@RunWith(SpringRunner.class)
public class MessageServiceTest {

    @Autowired
    MessageService messageService;

    @Test
    public void sendTopicMessage() {
        messageService.sendTopicMessage();
    }

    @Test
    public void sendFanoutMessage() {
        messageService.sendFanoutMessage();
    }

    @Test
    public void sentDirectMessage() {
        messageService.sentDirectMessage();
    }
}
