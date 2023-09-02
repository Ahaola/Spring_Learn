package com.example.Myconfig;

import com.example.common.LoginHander;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class config implements WebMvcConfigurer {

    @Autowired
    private LoginHander loginHander;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(loginHander)
                .addPathPatterns("/**") //拦截所有的url
                .excludePathPatterns("/user/login") //排除 /user/login 不拦截
                .excludePathPatterns("/user/reg")   //排除 /user/reg 不拦截
                .excludePathPatterns("/image/**");  //image下面的所有文件不拦截
    }
}
