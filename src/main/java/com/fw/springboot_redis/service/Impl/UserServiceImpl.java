package com.fw.springboot_redis.service.Impl;

import com.fw.springboot_redis.domain.User;
import com.fw.springboot_redis.service.UserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@CacheConfig(cacheNames = "redis_User")
@Service("userService")
public class UserServiceImpl implements UserService {


    @Cacheable(key = "#id",value = "userCache")
    @Override
    public User getUserById(Integer id) {
        System.out.println("查找了...");
        User user = new User();
        user.setId(0);
        user.setUserName("yqf");
        return user;
    }

    @CachePut(key = "#user.id",value = "user")
    @Override
    public User addUser(User user) {
        System.out.println("执行sql");
        return user;
    }

    @Cacheable(value = "users",key = "#root.methodName")
    @Override
    public List<User> getUserList() {
        List<User> users = new ArrayList<>();
        for(int i=0;i<5;i++){
            User user = new User();
            user.setId(i);
            user.setUserName("yqf");
            users.add(user);
        }
        return users;
    }
}
