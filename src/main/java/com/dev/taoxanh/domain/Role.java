package com.dev.taoxanh.domain;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "roles")
public class Role extends BaseModel{

    @Column(name = "name", length = 200, nullable = false)
    private String name;

    @Column(name = "description", length = 300, nullable = true)
    private String description;    
}
