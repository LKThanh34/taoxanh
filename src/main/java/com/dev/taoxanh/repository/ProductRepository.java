package com.dev.taoxanh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.taoxanh.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
