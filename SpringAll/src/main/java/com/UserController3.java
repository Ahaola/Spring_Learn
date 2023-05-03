package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 使用构造方法实现 bean 注入
 */
@Controller
public class UserController3 {

    private UserService userService;

    // 构造方法注入（官广推荐写法）
    @Autowired
    public UserController3(UserService userService) {
//        userService = new UserService(); // 传统的写法
        this.userService = userService;
    }

    public void sayHi() {
        userService.sayHi();
    }

}
