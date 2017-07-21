package com.example.demo.remote;

import com.example.demo.model.Order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by pcm on 2017/7/21.
 */
@FeignClient(value = "order-server",fallback = OrderRemoteImpl.class)
public interface OrderRemote
{
    @GetMapping("/findAllOrder")
    public List<Order> findAllOrder();

    @GetMapping("/findOrderByUserId/{id}")
    public List<Order> findOrderByUserId(@PathVariable("id") Integer userId);
}
