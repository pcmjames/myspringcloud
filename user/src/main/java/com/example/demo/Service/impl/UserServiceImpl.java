package com.example.demo.Service.impl;

import com.example.demo.Service.UserService;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pcm on 2017/7/19.
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(User user)
    {
        userMapper.insertSelective(user);
    }

    @Override
    @Cacheable(value = "userfindAllUser",keyGenerator = "keyGenerator")
    public List<User> findAllUser()
    {
        return userMapper.findAllUser();
    }

    @Override
    @Cacheable(value = "userfindUserById",keyGenerator = "keyGenerator")
    public User findUserById(Integer userId)
    {
        return userMapper.selectByPrimaryKey(userId);
    }
}
