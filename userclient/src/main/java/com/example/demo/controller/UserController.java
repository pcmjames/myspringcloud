package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pcm on 2017/7/19.
 */
@RestController
public class UserController
{
    @Autowired
    UserRemote userRemote;

    @GetMapping("/user")
    public List findUser(){
        return userRemote.findUser();
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") Integer userId){
        return userRemote.findUserById(userId);
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userRemote.addUser(user);
    }
}
