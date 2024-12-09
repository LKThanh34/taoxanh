package com.dev.taoxanh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.taoxanh.domain.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAll();
    
    Optional<Category> findByCategoryName(String categoryName);
    
}
