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
    @ResponseBody
    public String welcome(){
        return "Welcome!";
    }

    @RequestMapping("/userinfo")
    @ResponseBody
    public String getUser(String uid){
        User user = this.userService.getUserById(uid);
        return user.getUsername();
    }
}
