package com.dev.taoxanh.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contacts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact  extends BaseModel{
    @Column(name = "first_name", length = 60, nullable = false)
	private String firstName;

	@Column(name = "lastName", length = 60, nullable = false)
	private String lastName;

	@Column(name = "email", length = 120, nullable = true)
	private String email;

	@Column(name = "request_type", length = 120, nullable = true)
	private String requestType;

	@Column(name = "messasge", length = 120, nullable = true)
	private String message;

	@Column(name = "description", length = 120, nullable = true)
	private String description;

	@Column(name = "mobile", length = 20, nullable = true)
	private String mobile;
    
}
