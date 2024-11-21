package com.dev.taoxanh.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseModel {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY
	@Column(name = "id")
	private Integer id;

	@Column(name = "create_by", nullable = true)
	private Integer createBy;

	@Column(name = "update_by", nullable = true)
	private Integer updateBy;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "create_date", nullable = true)
	private Date createDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "update_date")
	private Date updateDate;

	@Column(name = "status")
	private Boolean status = Boolean.TRUE;
}
