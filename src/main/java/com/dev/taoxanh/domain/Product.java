package com.dev.taoxanh.domain;

import java.util.List;
import java.math.BigDecimal;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

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
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", length = 500)
    private String productName;

    @Column(name = "product_imge", length = 255)
    private String productImage;

    @Column(name = "title")
    private String descriptionTitle;

    @Column(name = "price")
	private BigDecimal price;

    @Column(name = "description")
    private String description;

    @Column(name = "year_of_manufacture")
    private Integer yearOfManufacture;

    @Column(name = "description_detail")
    private String descriptionDetail;



    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private List<OrderDetail> orderDetails;


    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ProductVariant> productVariants;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
