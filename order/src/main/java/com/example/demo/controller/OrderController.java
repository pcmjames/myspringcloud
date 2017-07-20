package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pcm on 2017/7/20.
 */
@RestController
public class OrderController
{
    @Autowired
    private OrderService orderService;

    @GetMapping("/findAllOrder")
    public List<Order> findAllOrder(){
        return orderService.findAllOrder();
    }

    @GetMapping("/findOrderByUserId/{id}")
    public List<Order> findOrderByUserId(@PathVariable("id") Integer userId){
        return orderService.findOrderByUserId(userId);
    }
}
