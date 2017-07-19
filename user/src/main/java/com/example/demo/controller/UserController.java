package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pcm on 2017/7/19.
 */
@RestController("application/json")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> findUser(){
        List<User> users = userService.findAllUser();
        return users;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
