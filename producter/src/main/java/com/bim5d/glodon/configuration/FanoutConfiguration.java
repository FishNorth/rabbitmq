package com.bim5d.glodon.configuration;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: guanl-c
 * @date: 2019/4/23 15:57
 * @description:
 */
@Configuration
public class FanoutConfiguration {

    @Bean(name = "Amessage")
    public Queue AMessage() {
        return new Queue("fanout.A");
    }


    @Bean(name = "Bmessage")
    public Queue BMessage() {
        return new Queue("fanout.B");
    }

    @Bean(name = "Cmessage")
    public Queue CMessage() {
        return new Queue("fanout.C");
    }

    @Bean
    FanoutExchange fanoutExchange() {
        // 配置广播路由器
        return new FanoutExchange("fanoutExchange");
    }

}
