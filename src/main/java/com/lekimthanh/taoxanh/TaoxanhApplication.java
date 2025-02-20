package com.lekimthanh.taoxanh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
})
public class TaoxanhApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaoxanhApplication.class, args);
	}

}
