package com.example.demo.controller;

import com.example.demo.entity.UserBlog;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getuserblog")
    public UserBlog getuserblog(Integer id) {
        if (id == null) return null;
        return userService.getuserblog(id);
    }

}
