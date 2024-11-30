package com.dev.taoxanh.service;
import java.util.List;
import org.springframework.stereotype.Service;

import com.dev.taoxanh.domain.Category;
import com.dev.taoxanh.domain.ProductGeneration;
import com.dev.taoxanh.repository.GenerationRepository;

@Service
public class GenerationService {
    private final GenerationRepository generationRepository;

    public GenerationService(GenerationRepository generationRepository) {
        this.generationRepository = generationRepository;
    }
    
    public List<ProductGeneration> getProductGenerationsByCategory(Category category){
        return this.generationRepository.findByCategory(category);
    }
}
