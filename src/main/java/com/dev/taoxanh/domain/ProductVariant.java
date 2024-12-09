package com.dev.taoxanh.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_variant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductVariant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_variant_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "attribute_value_id")
    private AttributeValue attributeValue;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "status")
    private String Status;

    @Column(name = "variant_price")
    private BigDecimal variantPrice;

    @Column(name = "display_technology", length = 200)
    private String displayTechnology;

    @Column(name = "camera_technology", length = 200)
    private String camera;

    @Column(name = "processor", length = 200)
    private String processor;

    @Column(name = "battery", length = 200)
    private String battery;

    @Column(name = "resolutions", length = 200)
    private String resolution;

    @Column(name = "ram", length = 200)
    private String ram;

    @Column(name = "storage", length = 200)
    private String storage;
    
    @Column(name = "material", length = 200)
    private String material;
    
    @Column(name = "price")
	private BigDecimal price;
}
