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
@Table(name = "attribute_values")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttributeValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attribute_value_id") 
    private Long id;
    
	@ManyToOne
	@JoinColumn(name = "attribute_id", nullable = false)
	private Attribute attribute;

    @OneToMany(mappedBy = "attributeValue", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ProductVariant> productVariants;

    @Column(name = "attribute_value", length = 200, nullable = false)
    private String attributeValue;
    
}
