package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Duizhao {
    @RequestMapping("/dui/zhao")
    String dui(){
        System.out.println("duiZhao");
        return "duiZhao";
    }
}
