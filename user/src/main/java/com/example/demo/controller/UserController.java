package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") Integer userId){
        User user = userService.findUserById(userId);
        return user;
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        userService.createUser(user);
        return user;
    }
}
