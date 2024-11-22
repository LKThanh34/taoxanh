package com.dev.taoxanh.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BaseModel {

	@Column(name = "code", length = 45, nullable = false)
	private String code;

	// Mapping many-to-one: saleOrder-to-user
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "total", nullable = true)
	private BigDecimal total;

	@Column(name = "customer_name", length = 100, nullable = true)
	private String customerName;

	@Column(name = "customer_address", length = 200, nullable = true)
	private String customerAddress;

	@Column(name = "customer_email", length = 100, nullable = true)
	private String customerEmail;

	@Column(name = "customer_mobile", length = 100, nullable = true)
	private String customerMobile;

	@Column(name = "description", length = 3000, nullable = true)
	private String description;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	private Set<OrderDetail> orderDetails = new HashSet<>();
}
