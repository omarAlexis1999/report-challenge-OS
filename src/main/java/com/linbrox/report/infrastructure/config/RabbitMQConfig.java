package com.linbrox.report.infrastructure.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "purchase-queue";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME, false);
    }
}