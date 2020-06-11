package com.example.ems.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestDemo {

    @RequestMapping("/test")
    public String TestD(){
        return "hello word!";
    }
}
