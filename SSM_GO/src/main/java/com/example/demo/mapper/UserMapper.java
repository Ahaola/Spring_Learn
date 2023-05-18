package com.example.demo.mapper;

import com.example.demo.entity.UserBlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    /**
     * 查询操作
     * @param id
     * @return
     */
    public UserBlog getuserblog(@Param("id") Integer id);

    /**
     * 添加操作
     * @param userBlog
     * @return
     */
    int add(UserBlog userBlog);

    /**
     * 添加操作
     * @param userBlog
     * @return
     */
    int addgetId(UserBlog userBlog);

    /**
     * 修改用户，传对象耦合度更低
     * @param userBlog
     * @return
     */
    int upUser(UserBlog userBlog);

    /**
     * 删除操作 根据用户id删除用户信息
     * @param id
     * @return
     */
    int delid(@Param("id")Integer id);

}
