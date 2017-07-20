package com.example.demo.mapper;

import com.example.demo.model.Order;
import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> findAllOrder();

    List<Order> findOrderByUserId(Integer userId);
}