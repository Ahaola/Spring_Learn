package com.example.demo.service;

import com.example.demo.entity.UserBlog;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserBlog getuserblog(Integer id) {
        return userMapper.getuserblog(id);
    }
}
