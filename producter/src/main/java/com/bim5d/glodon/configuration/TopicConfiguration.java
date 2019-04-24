package com.bim5d.glodon.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: guanl-c
 * @date: 2019/4/23 16:42
 * @description:
 */
@Configuration
public class TopicConfiguration {
    @Bean
    public Queue queueMessageA() {
        return new Queue("topicA");
    }

    @Bean
    public Queue queueMessageB() {
        return new Queue("topicB");
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    Binding bindingExchangeMessage(Queue queueMessageA, TopicExchange topicExchange) {
        return BindingBuilder.bind(queueMessageA).to(topicExchange).with("topic.A");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessageB, TopicExchange topicExchange) {
        return BindingBuilder.bind(queueMessageB).to(topicExchange).with("topic.#");//*表示一个词,#表示零个或多个词
    }
}
