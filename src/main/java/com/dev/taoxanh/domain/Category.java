package com.dev.taoxanh.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseModel {

    @Column(name = "name", length = 200, nullable = false)
    private String name;

    @Column(name = "description", length = 300, nullable = true)
    private String description;

    // quan hệ với Product
    
}
