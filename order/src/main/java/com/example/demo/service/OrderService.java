package com.example.demo.service;

import com.example.demo.model.Order;

import java.util.List;

/**
 * Created by pcm on 2017/7/20.
 */
public interface OrderService
{
    List<Order> findAllOrder();

    List<Order> findOrderByUserId(Integer userId);
}
