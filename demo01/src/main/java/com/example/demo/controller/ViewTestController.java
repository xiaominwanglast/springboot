package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class ViewTestController {

    @RequestMapping("test")
    public String testdemo(){
        return "hello";
    }
}
