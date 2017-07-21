package com.example.demo.service.impl;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
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
    @Cacheable(value = "orderFindAllOrder",keyGenerator = "keyGenerator")
    public List<Order> findAllOrder()
    {
        return orderMapper.findAllOrder();
    }

    @Override
    @Cacheable(value = "orderFindOrderByUserId",keyGenerator = "keyGenerator")
    public List<Order> findOrderByUserId(Integer userId)
    {
        return orderMapper.findOrderByUserId(userId);
    }
}
