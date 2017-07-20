package com.example.demo.service.impl;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pcm on 2017/7/20.
 */
@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAllOrder()
    {
        return orderMapper.findAllOrder();
    }

    @Override
    public List<Order> findOrderByUserId(Integer userId)
    {
        return orderMapper.findOrderByUserId(userId);
    }
}
