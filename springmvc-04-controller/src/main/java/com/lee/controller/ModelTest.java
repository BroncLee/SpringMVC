package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SpringMVC
 * @description:
 * @author: BroncLee
 * @create: 2022-08-05 15:04
 **/
@Controller
public class ModelTest {
    @RequestMapping("/m1/t1")
    public String test1(Model model){
//        重定向
        model.addAttribute("msg","redirect");
        return "redirect:/index.jsp"; //redirect 重定向不调用视图解析器   默认是转发会调用视图解析器
    }
}
