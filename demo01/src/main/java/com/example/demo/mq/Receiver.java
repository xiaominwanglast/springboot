package com.example.demo.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "producerTest01")
    public void process(String str){
        System.out.println("Receive:"+str);
    }

}
