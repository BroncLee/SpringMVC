package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SpringMVC
 * @description:
 * @author: BroncLee
 * @create: 2022-08-04 16:57
 **/
@Controller
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model){
//      封装数据
        model.addAttribute("msg","Hello,SpringMVC！");
        return "hello"; //会被视图解析器处理 这个就是视图名
    }
}
