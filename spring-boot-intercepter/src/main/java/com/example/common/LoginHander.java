package com.example.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class LoginHander implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws IOException {
        HttpSession session = request.getSession(false);
        if(session != null && session.getAttribute("session_userinfo") != null){
            return true;
        }else{
//            response.sendRedirect("http://www.baidu.com");
            return false;
        }
    }
}
