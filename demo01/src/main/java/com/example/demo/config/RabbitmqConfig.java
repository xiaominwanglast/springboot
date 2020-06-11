package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue Queue(){
        return new Queue("producerTest01");
    }
}
