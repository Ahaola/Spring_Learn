package com;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 使用 Setter 实现 bean 注入
 */
@Controller
public class UserController4 {

    private UserService userService;

    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void sayHi() {
        userService.sayHi();
    }

}
