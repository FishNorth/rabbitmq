package com.bim5d.glodon.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectConfiguration {
    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

}
