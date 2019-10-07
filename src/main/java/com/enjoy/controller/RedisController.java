package com.enjoy.controller;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
	
    @Resource
    private RedisTemplate<String,String> redisTemplate;
	
    @RequestMapping("/redis")
    public Object saveMsgToRedisAndGet() {
    	ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("name", "enjoy");
        String value = ops.get("name");
        return value;
    }
}
