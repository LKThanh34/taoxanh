package com.dev.taoxanh.controller.client;

import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



import com.dev.taoxanh.service.CategoryService;


@Controller
public class HomePageController {

    private final CategoryService categoryService;




    public HomePageController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // test view
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
