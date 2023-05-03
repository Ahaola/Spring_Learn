package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
//    @Resource
//    private User user1;

    @Autowired
    @Qualifier(value = "user2")
    private User user2;
    public void sayHi(){
        System.out.println("User"+user2);
    }
}
