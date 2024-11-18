package com.dev.taoxanh.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product extends BaseModel {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = true)
    private BigDecimal price;

    @Column(name = "sale_price", nullable = true)
    private BigDecimal salePrice;

    @Column(name = "short_description", length = 3000, nullable = true)
    private String shortDescription;

    private String detailDescription;

}
