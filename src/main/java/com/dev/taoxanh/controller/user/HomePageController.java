package com.dev.taoxanh.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    
    @GetMapping("/home")
    public String getHomePage(){
        return"user/home";
    }
}
