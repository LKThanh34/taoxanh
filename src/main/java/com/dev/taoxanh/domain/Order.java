package com.dev.taoxanh.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@CreationTimestamp
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "order_date")
	private Date orderDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "receive_date")
	private Date receiveDate;

	// Mapping many-to-one: saleOrder-to-user
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "total")
	private BigDecimal total;

	@Column(name = "customer_name", length = 100)
	private String customerName;

	@Column(name = "customer_address", length = 200)
	private String customerAddress;

	@Column(name = "customer_email", length = 100)
	private String customerEmail;

	@Column(name = "customer_mobile", length = 100)
	private String customerMobile;

	@Column(name = "description_order", length = 3000)
	private String descriptionOrder;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	private Set<OrderDetail> orderDetails = new HashSet<>();
}
