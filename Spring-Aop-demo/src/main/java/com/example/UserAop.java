package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect //切面
@Component // 不能省略
public class UserAop {
    //切点，用来写拦截规则
    // execution() 是最常⽤的切点函数，⽤来匹配⽅法，语法为：
    //execution(<修饰符><返回类型><包.类.⽅法(参数)><异常>)
    @Pointcut("execution(public * com.example.controller.UserController.*(..))")
    public void pointcut(){
    }
    @Before("pointcut()")
    public void doBefore(){
        System.out.println("前置通知："+ LocalDateTime.now());
    }

    @After("pointcut()")
    public void doAfter(){
        System.out.println("后置通知："+ LocalDateTime.now());
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开始执行环绕通知");
        Object obj = joinPoint.proceed();
        System.out.println("结束执行环绕通知");
        return obj;
    }

}
