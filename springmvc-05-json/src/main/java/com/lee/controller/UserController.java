package com.lee.controller;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.lee.pojo.User;
import com.lee.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @program: SpringMVC
 * @description:
 * @author: BroncLee
 * @create: 2022-08-05 16:58
 **/
//@Controller  //走视图解析器
@RestController //返回字符串
public class UserController {
//    @RequestMapping(value = "/j1",produces = "application/*;charset=UTF-8")
    @RequestMapping("/j1")
    //@ResponseBody //他不会被视图解析器解析 直接返回字符串
    public String json1() throws JsonProcessingException {
        //jackson 。ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("小贱",2,"1");
        return mapper.writeValueAsString(user);
    }
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
        ArrayList<User> userList = new ArrayList<User>();
        User user1 = new User("小贱",2,"1");
        User user2 = new User("小贱",2,"1");
        User user3 = new User("小贱",2,"1");
        User user4 = new User("小贱",2,"1");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
//        return mapper.writeValueAsString(userList);
        return JsonUtils.getJson(userList);
    }
    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        //Timestamp 时间戳
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }
    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {

        ArrayList<User> userList = new ArrayList<User>();
        User user1 = new User("小贱",2,"1");
        User user2 = new User("小贱",2,"1");
        User user3 = new User("小贱",2,"1");
        User user4 = new User("小贱",2,"1");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        //阿里巴巴 fastjson
        return JSON.toJSONString(userList);
    }
}
