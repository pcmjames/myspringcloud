package com.example.demo.remote;

import com.example.demo.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by pcm on 2017/7/19.
 */
@FeignClient(name = "user-server",fallback = UserRemoteImpl.class)
public interface UserRemote
{
    @GetMapping("/user")
    public List<User> findUser();

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") Integer userId);

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user);
}
