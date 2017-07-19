package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.data.redis.core.RedisConnectionUtils;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Collection;
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


    @Scheduled(cron="*/30 * * * * ?")
    private void process(){
        Set<String> keySet = redisTemplate.keys("*");
        redisTemplate.delete(keySet);
        System.out.println(new Date()+"  清除用户缓存信息!");
    }
}
