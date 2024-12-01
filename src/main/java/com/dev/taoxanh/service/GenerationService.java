package com.dev.taoxanh.service;
import java.util.List;
import org.springframework.stereotype.Service;

import com.dev.taoxanh.domain.Category;
import com.dev.taoxanh.domain.ProductGeneration;
import com.dev.taoxanh.repository.CategoryRepository;
import com.dev.taoxanh.repository.GenerationRepository;

@Service
public class GenerationService {
    private final GenerationRepository generationRepository;
    private final CategoryRepository categoryRepository;
    
    public GenerationService(GenerationRepository generationRepository, CategoryRepository categoryRepository) {
        this.generationRepository = generationRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<ProductGeneration> getGenerationsByCategory(Long categoryId){
        Category category = categoryRepository.findById(categoryId).orElseThrow(() -> new RuntimeException("Category không tồn tại"));
        return generationRepository.findByCategory(category);
    }

    public ProductGeneration handleSaveProductGeneration(ProductGeneration productGeneration){
        ProductGeneration newProductGeneration = this.generationRepository.save(productGeneration);
        return newProductGeneration;
    }

    public ProductGeneration getProductGenerationById(long id){
        return this.generationRepository.findById(id);
    }

    public void deleteAProductGeneration(long id){
        this.generationRepository.deleteById(id);
    }

    public List<ProductGeneration> getProductGenerationByYear(int year){
        return this.generationRepository.findByYearOfManufacture(year);
    }
}
