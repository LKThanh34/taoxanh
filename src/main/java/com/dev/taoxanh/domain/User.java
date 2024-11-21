package com.dev.taoxanh.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @Column(name = "username", length = 60, nullable = false)
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

    private List<Role> roles = new ArrayList<Role>();
    
}
