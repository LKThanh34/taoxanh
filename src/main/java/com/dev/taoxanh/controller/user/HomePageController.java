package com.dev.taoxanh.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/home/client")
    public String getHomePage() {
        return "client/homepage/show";
    }

    @GetMapping("/home/client/category")
    public String getCategoryPage() {
        return "client/product/categories";
    }

    @GetMapping("/home/client/detail")
    public String getDetailProductPage() {
        return "client/product/detail";
    }
    @GetMapping("/home/client/products")
    public String getProductsPage() {
        return "client/product/shop";
    }
}
