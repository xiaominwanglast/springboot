package com.example.demo.controller;

import com.example.demo.bo.UserLogin;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper02;
import com.example.demo.mq.Producter;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(tags = "用户信息相关接口")
@RequestMapping("/testBoot")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper02 userMapper02;

    @Autowired
    Producter producter;

    @RequestMapping("getUser/{id}")
    @ApiOperation("获取用户id接口")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).getPassword();
    }

    @RequestMapping("getMockUser/{id}")
    @ApiOperation("获取用户mock数据")
    public User GetMockUser(@PathVariable("id") int id){
        User user =new User(id,"xiaomin","123456","xiaomin");
        System.out.println(user);
        return new User(id,"xiaomin","123456","xiaomin");
    }

    @PostMapping("/setPassWord")
    @ApiOperation("插入用户数据")
    public User dealPassWord(@RequestBody @Validated UserLogin userlogin){
         System.out.println(userlogin);
         User user=new User(6,userlogin.getUserName(),userlogin.getPassWord(),"xiaomin");
         userService.Insert(user);
         return user;
    }

    @RequestMapping("getUserInfo")
    @ApiOperation("查询用户信息")
    public Map<String,String> findUserInfo(@RequestParam("userName") String userName,@RequestParam("passWord") String passWord,@RequestHeader Map<String,String> header) throws JSONException {
        System.out.println(userName);
        System.out.println(passWord);
        header.forEach((k,v)->System.out.println("key:"+k+";"+"value:"+v+";"));
        System.out.println(userMapper02.findName(userName).toString());
        Map<String,String> userMap=new HashMap<String, String>();
        userMap.put("userName",userName);
        userMap.put("passWord",passWord);
        producter.sendMq();
        return userMap;
    }

}
