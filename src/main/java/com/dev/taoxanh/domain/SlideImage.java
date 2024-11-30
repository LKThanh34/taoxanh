package com.dev.taoxanh.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "slide_images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SlideImage{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY
	private Long id;

    @Column(name="slider_name", length=300, nullable=true)
	private String slideName;
	
	@Column(name="slide_path", length=255, nullable=false)
	private String slidePath;
	
	@Column(name="slider_description", length=500, nullable=true)
	private String sliderDescription;
}
