package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
public class BeanConfig {

    @Bean  //创建这个对象在工厂的一个实例
    public Calendar getCalendar(){
        return Calendar.getInstance();
    }
}
