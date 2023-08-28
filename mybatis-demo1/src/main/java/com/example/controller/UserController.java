package com.example.controller;

import com.example.entity.UserEntity;
import com.example.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/getall")
    public List<UserEntity> getAll(){
        return userService.getAll();
    }
}
