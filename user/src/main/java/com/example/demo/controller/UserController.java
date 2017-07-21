package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pcm on 2017/7/19.
 */
@RefreshScope
@RestController
public class UserController
{
    @Autowired
    private UserService userService;
    @Value("${hello}")
    private String hello;

    @GetMapping("/user")
    public List<User> findUser(){
        List<User> users = userService.findAllUser();
        return users;
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") Integer userId){
        User user = userService.findUserById(userId);
        return user;
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        userService.createUser(user);
        return user;
    }

    @GetMapping("test")
    public String getHello(){
        return hello;
    }
}
