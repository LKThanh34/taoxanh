package com.dev.taoxanh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.taoxanh.domain.Category;
import com.dev.taoxanh.repository.CategoryRepository;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return this.categoryRepository.findAll();
    }
    
}
