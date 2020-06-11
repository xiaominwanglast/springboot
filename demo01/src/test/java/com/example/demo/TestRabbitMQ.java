package com.example.demo;

import com.example.demo.mq.Producter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestRabbitMQ  extends DemoApplicationTests{

    @Autowired
    Producter producter;

    @Test
    public void testRabbit(){
        producter.sendMq();
    }
}
