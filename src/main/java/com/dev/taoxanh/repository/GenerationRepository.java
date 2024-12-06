package com.dev.taoxanh.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.taoxanh.domain.Category;
import com.dev.taoxanh.domain.ProductGeneration;

@Repository
public interface GenerationRepository extends JpaRepository<ProductGeneration, Long> {

    ProductGeneration save(ProductGeneration newProductGeneration);

    void deleteById(long id);

    ProductGeneration findById(long id);

    List<ProductGeneration>findByCategory(Category category);

    List<ProductGeneration>findByYearOfManufacture(int yearOfManufacture);
}
