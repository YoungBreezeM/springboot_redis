package com.fw.springboot_redis.service;

import com.fw.springboot_redis.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    /**
     * 获取所有用户信息
     * */
    User getUserById(Integer id);
    /**
     * 添加用户
     * */
    User addUser(User user);
    /**
     * 查找所用用户
     * */
    List<User> getUserList();
}
