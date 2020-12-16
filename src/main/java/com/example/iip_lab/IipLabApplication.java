package com.example.iip_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class IipLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(IipLabApplication.class, args);
	}

}
