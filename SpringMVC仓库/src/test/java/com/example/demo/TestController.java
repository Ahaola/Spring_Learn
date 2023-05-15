package com.example.demo;

import com.sun.org.slf4j.internal.Logger;
import jdk.nashorn.internal.runtime.Context;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

@RequestMapping("/user")//url路由注册
@ResponseBody // 返回的是数据而不是页面
@Controller // 让框架启动的时候加载当前类，别人才能访问
//@RestController
public class TestController {

    private Logger log;

    //    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    @GetMapping("/hi")
//    @PostMapping("/hi")
//    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    public String sayHi(String name){
        return "hi" + name;
    }

    @RequestMapping("/can")
    public String sayHi2(Integer id){
        return "id="+id;
    }

    @GetMapping("/show-user")
    public String ShowUser(User user){
        return user.toString();
    }
    @GetMapping("/show-time")
    public String showtime(@RequestParam(value = "t1",required = false) String starttime,
                           @RequestParam(value = "t2",required = false) String endtime){
        return "开始时间"+starttime +"| 结束时间"+endtime;
    }

    // 接收 JSON 对象 @RequestBody（和第三方系统通讯时常见的场景）
    @PostMapping("/showJson")
    public String showJson(@RequestBody User user){
        return user.toString();
    }

    @RequestMapping("/login/{username}/{password}")
    public String login(@PathVariable("username")String username,
                        @PathVariable("password")String password){
        return username + ":"+password;
    }

    @RequestMapping("/upfile")
    public String upfile(@RequestPart("myfile") MultipartFile file) throws IOException {
        String path = "D:\\Spirng框架\\Spirng_GO\\Spring_Learn\\SpringMVC仓库\\Pictures\\img.png";
        file.transferTo(new File(path));
        return path;
    }

    @RequestMapping("/myupfile")
    public String myUpFile(@RequestPart("myfile") MultipartFile file) throws IOException {
        // 根目录
        String path = "D:\\Spirng框架\\Spirng_GO\\Spring_Learn\\SpringMVC仓库\\Pictures\\";
        // 根目录 + 【唯一的文件名】
        path += UUID.randomUUID().toString().replace("-", "");
        // 根目录 + 唯一的明文件 + 【文件的后缀】  ex:.png
        path += file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //
        file.transferTo(new File(path));
        return path;
    }


    // Spring MVC(Spring Web) 内置了 HttpServletRequest 和 HttpServletResponse
    @GetMapping("/getparam")
    public String getParam(HttpServletRequest req) {
        return req.getParameter("username");
    }

    @RequestMapping("/getck")
    public String getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie item : cookies) {
            log.error(item.getName() + ":" + item.getValue());
        }
        return "get cookie~";
    }

    @RequestMapping("/getck2")
    public String getCookie2(@CookieValue("zhangsan") String val) {
        return "Cookie Value:" + val;
    }


    @RequestMapping("/getua")
    public String getUA(@RequestHeader("User-Agent") String userAgent) {
        return userAgent;
    }


    @RequestMapping("/setsess")
    public String setSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("userinfo", "userinfo");
        return "Set Session Success.";
    }

    @RequestMapping("/getsess")
    public String getSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false); // 切记一定要加 false
        if (session != null && session.getAttribute("userinfo") != null) {
            return (String) session.getAttribute("userinfo");
        } else {
            return "暂无 Session 信息";
        }
    }

    @RequestMapping("/getsess2")
    public String getSession2(@SessionAttribute(value = "userinfo", required = false) String userinfo) {
        return userinfo;
    }


    @RequestMapping("/respjson")
    public HashMap<String, String> respJson() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Java", "Java Value");
        map.put("MySQL", "MySQL Value");
        map.put("Redis", "Redis Value");
        return map;
    }

}

