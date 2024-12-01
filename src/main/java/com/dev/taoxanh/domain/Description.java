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
@Table(name = "descriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "description_id") 
    private Long id;

    @Column(name = "title_description", length = 200, nullable = false)
    private String titleDescription;

    @Column(name = "description_detailed", length = 500, nullable = false)
    private String descriptionDetailed;

    @OneToMany(mappedBy = "description", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ProductGeneration> productGenerations;
}
