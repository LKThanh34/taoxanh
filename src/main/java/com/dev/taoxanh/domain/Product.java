package com.dev.taoxanh.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseModel {

    @Column(name = "name", length = 500, nullable = false)
    private String name;

    @Column(name = "price", nullable = true)
    private BigDecimal price;

    @Column(name = "sale_price", nullable = true)
    private BigDecimal salePrice;

    @Column(name = "short_description", length = 3000, nullable = true)
    private String shortDescription;

    @Column(name = "detail_description", nullable = true)
    private String detailDescription;

    @Column(name = "avatar", length = 255, nullable = true)
    private String avatar;

    @Column(name = "is_hot", nullable = true)
    private Boolean isHot = Boolean.FALSE;

    @Column(name = "sticker", length = 255, nullable = true)
    private String sticker;

    @Column(name = "incentive", length = 255, nullable = true)
    private String incentive;

    @Column(name = "quantity", nullable = false)
    private BigInteger quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "product_images", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductImage> productImages;
}
