package com.mjc.voice.controller;

import com.mjc.voice.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * Created by gcb on 2019/1/23.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");

       SimpleDateFormat sdf=  new SimpleDateFormat("yyyyMMdd");
     try {
         sdf.parse("20180206");

     }catch (Exception e){

     }
        return user;
    }
}
