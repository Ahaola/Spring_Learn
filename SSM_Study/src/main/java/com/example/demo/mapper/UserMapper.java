package com.example.demo.mapper;

import com.example.demo.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    Blog getuserblog(@Param("userId") Integer userId);
}
