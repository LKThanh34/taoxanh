package com.dev.taoxanh.domain;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseModel {

    @Column(name = "name", length = 200, nullable = false)
    private String name;

    @Column(name = "description", length = 300, nullable = true)
    private String description;

	// Ánh xạ quan hệ với Product (1)
	//Mapping one-to-many: category-to-product
	// mapped đến category ở bên Product
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
    private Set<Product> products = new HashSet<Product>();

    public void addRelationalProduct(Product product){
        products.add(product);
        product.setCategory(this);
    }

    public void deleteRelationalProduct(Product product){
        products.remove(product);
        product.setCategory(null);
    }

    public Category(){
        super();
    }

    public Category(Integer id, Integer createBy, Integer updateBy, Date createDate, Date updateDate, Boolean status,
            String name, String description, Set<Product> products) {
        super(id, createBy, updateBy, createDate, updateDate, status);
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
