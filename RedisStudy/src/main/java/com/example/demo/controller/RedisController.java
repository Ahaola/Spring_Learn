package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    // 1.引入 redis 模板（redis 本身）
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/set")
    public String setRedis() {
        // redis 写缓存操作
        stringRedisTemplate.opsForValue().set("username", "zhangsan");
        return "redis 存储成功";
    }

    @RequestMapping("/get")
    public String getRedis() {
        String result = stringRedisTemplate.opsForValue().get("username");
        return result;
    }

}
