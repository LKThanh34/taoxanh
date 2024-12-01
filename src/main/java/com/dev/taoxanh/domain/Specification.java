package com.dev.taoxanh.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "specifications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Specification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specification_id") 
    private Long id;

    @Column(name = "display_technology", length = 200, nullable = true)
    private String displayTechnology;

    @Column(name = "camera_technology", length = 200, nullable = true)
    private String camera;

    @Column(name = "processor", length = 200, nullable = true)
    private String processor;

    @Column(name = "battery", length = 200, nullable = true)
    private String battery;

    @Column(name = "resolutions", length = 200, nullable = true)
    private String resolution;

    @Column(name = "ram", length = 200, nullable = true)
    private String ram;

    @Column(name = "storage", length = 200, nullable = true)
    private String storage;
    
    @Column(name = "material", length = 200, nullable = true)
    private String material;

    @OneToMany(mappedBy = "specification", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ProductVariant> productVariants;
}
