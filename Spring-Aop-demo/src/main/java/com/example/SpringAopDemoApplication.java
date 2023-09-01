package com.example;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Aspect
@SpringBootApplication
public class SpringAopDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopDemoApplication.class, args);
    }

}
