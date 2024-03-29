package com.example.demo.service;

import com.example.demo.entity.Blog;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Blog getuserblog(Integer blogId){
        return userMapper.getuserblog(blogId);
    }
}
