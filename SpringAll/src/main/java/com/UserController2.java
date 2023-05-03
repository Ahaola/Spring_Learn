package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 根据属性实现 bean 对象的注入
 */
@Controller
public class UserController2 {

    // 对象注入方式1：属性注入
    @Autowired
//    @Resource
    private UserService userService;

    public void sayHi() {
        userService.sayHi();
    }

}
