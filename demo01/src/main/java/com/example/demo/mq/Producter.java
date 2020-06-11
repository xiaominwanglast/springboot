package com.example.demo.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Producter {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public String sendMq(){
        List<String> list=new ArrayList<>();
        list.add("day");
        list.add("week");
        Map<String,Object> map =new HashMap<>();
        map.put("date",list);
        String mq=map.toString();
        rabbitTemplate.convertAndSend("producerTest01",mq);
        System.out.println("send OK!");
        return "send OK!";
    }
}
