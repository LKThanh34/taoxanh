package com.dev.taoxanh.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_generations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductGeneration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "generation_id")
    private Long id;

    @Column(name = "generation_name", length = 200, nullable = false)
    private String generationName;

    @Column(name = "generation_description", length = 1000, nullable = true)
    private String generation_description;

    @Column(name = "generation_status", length = 1000, nullable = true)
    private String generationStatus;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "productGeneration", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;
}
