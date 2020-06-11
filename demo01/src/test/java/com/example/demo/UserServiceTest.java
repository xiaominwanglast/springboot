package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends DemoApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void GetUser(){
        System.out.println(userService.Sel(1).toString());
    }
}
