package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Set;

/**
 * Created by pcm on 2017/7/19.
 */
@Component
public class SchedulerTask
{
    @Autowired
    RedisTemplate redisTemplate;


    @Scheduled(cron="0 */1 * * * ?")
    private void process(){
        Set<String> keySet = redisTemplate.keys("order*");
        redisTemplate.delete(keySet);
        System.out.println(new Date()+"  清除订单缓存信息!");
    }
}
