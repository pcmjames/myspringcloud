package com.example.demo.Controller;


import com.alibaba.fastjson.JSON;
import com.example.demo.model.NewOrder;
import com.example.demo.model.Order;
import com.example.demo.remote.OrderRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcm on 2017/7/20.
 */
@RestController
public class OrderController
{
    @Autowired
    private OrderRemote orderRemote;

    @GetMapping("/findAllOrder")
    public String findAllOrder()
    {
        String jsonStr;
        List<Order> orders = orderRemote.findAllOrder();
        List<NewOrder> newOrders = new ArrayList<>();
        if (orders == null)
        {
            jsonStr = "服务出错了！";
        } else if (orders.isEmpty())
        {
            jsonStr = "订单数据为空！";
        } else
        {
            for (int i= 0; i<orders.size(); i++){
                NewOrder newOrder = new NewOrder();
                newOrder.setOrderid(orders.get(i).getOrderid());
                newOrder.setUserid(orders.get(i).getUserid());
                newOrder.setDescription(orders.get(i).getDescription());
                newOrder.setCreatetime(orders.get(i).getCreatetime().toLocaleString());
                newOrders.add(newOrder);
            }
            jsonStr = JSON.toJSONString(newOrders);
        }
        return jsonStr;
    }

    @GetMapping("/findOrderByUserId/{id}")
    public String findOrderByUserId(@PathVariable("id") Integer userId)
    {
        String jsonStr;
        List<Order> orders = orderRemote.findOrderByUserId(userId);
        List<NewOrder> newOrders = new ArrayList<>();
        if (orders == null)
        {
            jsonStr = "服务出错了！";
        } else if (orders.isEmpty())
        {
            jsonStr = "没有找到订单数据！";
        } else
        {
            for (int i= 0; i<orders.size(); i++){
                NewOrder newOrder = new NewOrder();
                newOrder.setOrderid(orders.get(i).getOrderid());
                newOrder.setUserid(orders.get(i).getUserid());
                newOrder.setDescription(orders.get(i).getDescription());
                newOrder.setCreatetime(orders.get(i).getCreatetime().toLocaleString());
                newOrders.add(newOrder);
            }
            jsonStr = JSON.toJSONString(newOrders);
        }
        return jsonStr;
    }
}
