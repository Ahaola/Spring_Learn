package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public void sayHi(){
        System.out.println("hello UserController");
    }
}
