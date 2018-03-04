package com.curtain.controller;

import com.curtain.entity.User;
import com.curtain.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserCenterController {
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public String welcome(){
        return "home.html";
    }

    @RequestMapping("/userinfo")
    @ResponseBody
    public String getUser(String uid){
        User user = this.userService.getUserById(uid);
        return user.getUsername();
    }
}
