package com.dev.taoxanh.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;

public class DashboardController {
    @GetMapping("/admin")
    public String getDashboard(){
        return"admin/home-admin";
    }
}
