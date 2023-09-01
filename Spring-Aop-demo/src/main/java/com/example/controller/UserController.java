package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user/hello")
    public String sayhello(){
        System.out.println("say hello");
        return "say hello";
    }

    @RequestMapping("/user/world")
    public String hello(){
        System.out.println("hai world");
        return "hai world";
    }
}
