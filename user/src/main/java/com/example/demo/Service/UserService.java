package com.example.demo.Service;


import com.example.demo.model.User;

import java.util.List;

/**
 * Created by pcm on 2017/7/19.
 */
public interface UserService
{
    void createUser(User user);

    List<User> findAllUser();

    User findUserById(Integer userId);
}
