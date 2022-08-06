package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SpringMVC
 * @description:
 * @author: BroncLee
 * @create: 2022-08-04 18:23
 **/
@Controller
public class ControllerTest01 {

    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable String b, Model model){
        String res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "hello";
    }
}
