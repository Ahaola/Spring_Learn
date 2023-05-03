package com;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserBeans {
    @Bean(name = "user1") // 【注意事项：只使用一个 @Bean 是无法将对象存储到容器中的】
    public User getUser1() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        return user;
    }

    @Bean(name = "user2") // 【注意事项：只使用一个 @Bean 是无法将对象存储到容器中的】
    public User getUser2() {
        User user = new User();
        user.setId(2);
        user.setName("李四");
        return user;
    }
//
//    @Bean(name = "user3")
////    @Scope("prototype") // 原型模式
////    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public User getUser3() {
//        User user = new User();
//        user.setId(1);
//        user.setName("Java");
//        return user;
//    }

}
