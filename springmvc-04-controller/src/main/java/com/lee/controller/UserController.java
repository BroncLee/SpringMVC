package com.lee.controller;

import com.lee.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: SpringMVC
 * @description:
 * @author: BroncLee
 * @create: 2022-08-05 15:34
 **/
@Controller
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username")String name, Model model){
        System.out.println("前端参数"+name);
        //参数传递给前端
        model.addAttribute("msg",name);
        //视图跳转
        return "test";
    }
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }
}
