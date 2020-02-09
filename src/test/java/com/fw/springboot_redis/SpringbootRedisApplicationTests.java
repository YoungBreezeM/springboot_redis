package com.fw.springboot_redis;

import com.fw.springboot_redis.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.*;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
//        Set<String> keys = redisTemplate.keys("*");
//        Map<String,Object> map = new HashMap<String,Object>();
//        for (String key:keys){
//            Object value = redisTemplate.opsForValue().get(key);
//            map.put(key,value);
//        }
//        System.out.println(map);
    }
}
