package com.curtain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserCenterController {
    @RequestMapping("/index")
    @ResponseBody
    public String welcome(){
        return "Welcome!";
    }
}
