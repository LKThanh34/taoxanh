package com.dev.taoxanh.controller.admin;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.taoxanh.domain.ProductGeneration;
import com.dev.taoxanh.service.GenerationService;

@Controller
public class GenerationController {
    private final GenerationService generationService;

    public GenerationController(GenerationService generationService) {
        this.generationService = generationService;
    }

    @GetMapping("/dashboard/generation/{categoryId}")
    public String getGenerationsByCategory(@PathVariable Long categoryId, Model model){
        List<ProductGeneration> generations = generationService.getGenerationsByCategory(categoryId);
        model.addAttribute("generations", generations);
        return "admin/generations/show";
    }

    




}
