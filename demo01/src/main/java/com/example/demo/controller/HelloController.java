package com.example.demo.controller;

import com.example.demo.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

@Controller(value = "test")
@RequestMapping("hello")
public class HelloController {

    @Value("${testnames}")
    private String[] testnames;

    @Value("#{'${test.list}'.split(',')}")
    private List<String> list;

    @Value("#{${test.maps}}")
    private Map<String,String> maps;

    @Autowired
    Calendar calendar;

    @Value("${name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello springboot");
        System.out.println("姓名:"+name);
        System.out.println("项目名:"+port);
        System.out.println("config"+ calendar.getTime());
        for(String i:testnames){
            System.out.println("testnames"+i);
        }
        list.forEach((l) ->System.out.println(l));
        maps.forEach((k,v) -> System.out.println("k"+k+'v'+v));

        Animal animal = Animal.builder().id(1).name("dog").sex("girl").build();
        System.out.println(animal.toString());
        return "hello";
    }

}
