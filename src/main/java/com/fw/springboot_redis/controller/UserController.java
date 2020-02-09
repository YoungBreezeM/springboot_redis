package com.fw.springboot_redis.controller;

import com.fw.springboot_redis.domain.User;
import com.fw.springboot_redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "{id}")
    public User getUserList(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> getUserList(){
        return userService.getUserList();
    }
}
