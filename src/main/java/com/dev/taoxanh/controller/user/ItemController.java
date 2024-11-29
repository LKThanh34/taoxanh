package com.dev.taoxanh.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ch.qos.logback.core.model.Model;

public class ItemController {

        @GetMapping("/product/{id}}")
    public String getHomePage(Model model, @PathVariable long id) {
        return "client/product/detail";
    }
    
}
