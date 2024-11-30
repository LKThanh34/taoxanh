package com.dev.taoxanh.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.taoxanh.domain.Category;
import com.dev.taoxanh.service.CategoryService;

@Controller
public class CategoryController {

    private final CategoryService categoryService;
    
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }



    @GetMapping("/dashboard")
    public String getCategoryPage(Model model){
        List<Category> categories = this.categoryService.getAllCategories();
        model.addAttribute("categoryList", categories);
        return "admin/dashboard/show";
    }
}
