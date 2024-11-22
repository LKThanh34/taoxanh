package com.dev.taoxanh.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class SlideImage  extends BaseModel {

    @Column(name="name", length=300, nullable=true)
	private String name;
	
	@Column(name="path", length=255, nullable=false)
	private String path;
	
	@Column(name="description", length=500, nullable=true)
	private String description;

    
}
