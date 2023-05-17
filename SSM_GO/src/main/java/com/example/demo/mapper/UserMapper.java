package com.example.demo.mapper;

import com.example.demo.entity.UserBlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    public UserBlog getuserblog(@Param("id") Integer id);
}
