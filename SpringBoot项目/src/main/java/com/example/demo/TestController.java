package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Controller//当前类是控制器
@ResponseBody//返回的是数据，而非页面
public class TestController {

//    @Value("${mytest1}")
//    private String mytest1;
//
//    @Value("${mytest2}")
//    private String mytest2;
//
//    @Value("${myString1}")
//    private String myString1;
//
//    @Value("${myString2}")
//    private String myString2;
//
//    @Value("${myString3}")
//    private String myString3;
//
//    @PostConstruct
//    public void PostConstruct(){
//        System.out.println("myString1"+myString1);
//        System.out.println("myString2"+myString2);
//        System.out.println("myString3"+myString3);
//    }

    @Component
    public class ReadYml2 {
        @Autowired
        private Student student;
        @PostConstruct
        public void postConstruct() {
            System.out.println(student);
        }
    }


    @RequestMapping("/hello")//url路由注册
    public String sayHi(String name){

        if(!StringUtils.hasLength(name)){
            name = "SpringBoot";
        }
        return "hello"+ name;
    }

//    @RequestMapping("/getconf")
//    public String getconf(){
//        return "mytest1"+ mytest1 +"这是分割符" + "mytest2"+mytest2;
//    }
}
