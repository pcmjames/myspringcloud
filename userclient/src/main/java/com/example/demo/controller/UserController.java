package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.User;
import com.example.demo.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String findUser(){
        String jsonStr;
        List<User> users = userRemote.findUser();
        if(users == null){
            jsonStr = "服务出错了！";
        }else if(users.isEmpty()){
            jsonStr = "没有用户！";
        }else {
            jsonStr = JSON.toJSONString(users);
        }
        return jsonStr;
    }


    @GetMapping("/user/{id}")
    public String findUserById(@PathVariable("id") Integer userId){
        String jsonStr;
        User user = userRemote.findUserById(userId);
        if(user == null){
            jsonStr = "未找到该用户！";
        }else{
            jsonStr = JSON.toJSONString(user);
        }

        return jsonStr;
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        String jsonStr;
        try{
            User user1 = userRemote.addUser(user);
            jsonStr = JSON.toJSONString(user1);
        }catch (Exception e){
            jsonStr = "添加用户失败！";
        }
        return jsonStr;
    }
}
