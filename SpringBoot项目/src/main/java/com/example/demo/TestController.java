package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller//当前类是控制器
@ResponseBody//返回的是数据，而非页面
public class TestController {

    @RequestMapping("/hello")//url路由注册
    public String sayHi(String name){

        if(!StringUtils.hasLength(name)){
            name = "SpringBoot";
        }
        return "hello"+ name;
    }
}
