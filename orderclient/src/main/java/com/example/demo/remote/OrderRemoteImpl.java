package com.example.demo.remote;

import com.example.demo.model.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by pcm on 2017/7/21.
 */
@Component
public class OrderRemoteImpl implements OrderRemote
{
    @Override
    public List<Order> findAllOrder()
    {
        return null;
    }

    @Override
    public List<Order> findOrderByUserId(@PathVariable("id") Integer userId)
    {
        return null;
    }
}
