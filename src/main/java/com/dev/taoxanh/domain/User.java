package com.dev.taoxanh.domain;

import java.util.List;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@CreationTimestamp
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "create_date", nullable = true)
	private Date createDate;

	@Column(name = "username", length = 60, nullable = false)
	private String username;

	@Column(name = "user_password", length = 60, nullable = false)
	private String userPassword;

	@Column(name = "email", length = 120, nullable = true)
	private String email;

	@Column(name = "phone", length = 120, nullable = true)
	private String phone;

	@Column(name = "address", length = 200, nullable = true)
	private String address;

	@Column(name = "user_description", length = 200, nullable = true)
	private String userDescription;

	@Column(name = "avatar_iamge", length = 255, nullable = true)
	private String avatarImage;

	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

	@OneToMany(mappedBy = "user")
	private List<Order> orders;
}
