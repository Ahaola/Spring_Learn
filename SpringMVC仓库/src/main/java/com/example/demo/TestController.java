package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")//url路由注册
@ResponseBody // 返回的是数据而不是页面
@Controller // 让框架启动的时候加载当前类，别人才能访问
//@RestController
public class TestController {

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

    // 接收 JSON 对象（和第三方系统通讯时常见的场景）
    @PostMapping("/showJson")
    public String showJson(@RequestBody User user){
        return user.toString();
    }

}
