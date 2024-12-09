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
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
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
	@Column(name = "create_date")
	private Date createDate;

	@NotNull
	@Column(name = "username", length = 60)
	private String username;

	@Null
	@Size(min = 3)
	@Column(name = "user_password", length = 60)
	private String userPassword;

	@NotNull
	@Email
	@Column(name = "email", length = 120)
	private String email;

	@NotNull
	@Column(name = "phone", length = 120)
	private String phone;

	@Column(name = "address", length = 200)
	private String address;

	@Column(name = "avatar_iamge", length = 255)
	private String avatarImage;

	@Column(name = "status")
	private Integer status;
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	@OneToMany(mappedBy = "user")
	private List<Order> orders;

}
