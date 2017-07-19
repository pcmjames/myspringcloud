package com.example.demo.remote;

import com.example.demo.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PCM on 2017/7/19.
 */
@Component
public class UserRemoteImpl implements UserRemote {
    @Override
    @GetMapping("/user")
    public List<User> findUser() {
        return null;
    }

    @Override
    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") Integer userId) {
        return null;
    }

    @Override
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return null;
    }
}
