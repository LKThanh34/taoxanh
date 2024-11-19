package com.dev.taoxanh.domain;

import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.security.core.userdetails.UserDetails;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@SuppressAjWarnings("serial")
@Entity
@Table(name = "users")
public class User extends BaseModel implements UserDetails {
    
    @Column(name="username", length = 60, nullable = false)
    private String username;

    @Column(name = "password", length = 60, nullable = false)
    private String password;

    @Column(name = "email", length = 120, nullable = true)
    private String email;

    @Column(name = "mobile", length = 120, nullable = true)
    private String mobile;

    @Column(name = "description", length = 200, nullable = true)
    private String description;

    @Column(name = "avatar", length = 255, nullable = true)
    private String avatar;

    @Column(name = "spending", nullable = false)
    private BigDecimal spending;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private Set<SaleOrder> saleOrders = new HashSet<SaleOrder>();

    


}
