package com.example.demo.mapper;

import com.example.demo.entity.UserBlog;
import org.apache.catalina.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

import static org.apache.tomcat.websocket.WsSession.ids;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //1、表示当前单元测试是运行在Spring boot环境中
class UserMapperTest {

    //2、注入测试对象
    @Autowired
    private UserMapper userMapper;

    //3.添加单元测试的业务代码
    @Test
    void getuserblog(){
        UserBlog userBlog = userMapper.getuserblog(5);
        System.out.println(userBlog);
    }

    @Test
    void add() {
        //伪代码，构造对象并设置对应的值
        UserBlog userBlog = new UserBlog();
        userBlog.setId(5);
        userBlog.setSn(6);
        userBlog.setName("zhaoliu");
        userBlog.setQq_mail("789");
        //调用mybatis添加方法
        int ret = userMapper.add(userBlog);
        System.out.println("添加："+ret);

        int uid = userBlog.getId();
        System.out.println("用户ID"+uid);
        //断言看是否是一行数据受到了影响
        Assertions.assertEquals(1,ret);
    }

    @Test
    void addgetId() {
        //伪代码，构造对象并设置对应的值
        UserBlog userBlog = new UserBlog();
        userBlog.setId(5);
        userBlog.setSn(6);
        userBlog.setName("xiaohei");
        userBlog.setQq_mail("601");
        //调用mybatis添加方法
        int ret = userMapper.addgetId(userBlog);
        System.out.println("添加："+ret);

        int useid = userBlog.getId();
        System.out.println("用户Id:"+useid);
        //断言看是否是一行数据受到了影响
        Assertions.assertEquals(1,ret);
    }


    @Test
    void upUser() {
        //构建测试数据
        UserBlog userBlog = new UserBlog();
        userBlog.setId(5);
        userBlog.setName("小黑");
        int result = userMapper.upUser(userBlog);
        System.out.println("修改后"+result);
        //断言看是否是一行数据受到了影响
        Assertions.assertEquals(1,result);
    }

    @Test
    @Transactional //不破坏数据库的情况下，验证功能是否正常
    void delid() {
        Integer id = 4;
        int res = userMapper.delid(id);
        System.out.println("删除后:"+res);
        //断言看是否是一行数据受到了影响
        Assertions.assertEquals(1,res);
    }

    @Test
    void add2() {
        UserBlog userBlog = new UserBlog();
        userBlog.setId(12);
        userBlog.setSn(601);
        userBlog.setName("哈哈哈");
        userBlog.setQq_mail("12345@qq.com");
        int result = userMapper.add2(userBlog);
        System.out.println(result);
    }

    @Test
    void add3() {
        UserBlog userBlog = new UserBlog();
        userBlog.setId(13);
        userBlog.setSn(701);
        userBlog.setName("xiaoxiao");
        userBlog.setQq_mail("67890@qq.com");
        int result = userMapper.add3(userBlog);
        System.out.println("添加:"+result);
    }

    @Test
    void wheredemo() {
        List<UserBlog> list = userMapper.wheredemo("baga",null);
        System.out.println(list);
    }

    @Test
    void update2() {
        UserBlog userBlog = new UserBlog();
        userBlog.setId(8);
        userBlog.setName("apple");
        userBlog.setQq_mail("1221@qq.com");
        int result = userMapper.add3(userBlog);
        System.out.println("添加:"+result);
    }

//    @Test
//    void dels() {
//        List<Integer> list = new LinkedList<>();
//        list.add(20);
//        list.add(21);
//        int result = userMapper.dels(ids);
//        System.out.println("删除:"+result);
//    }
}