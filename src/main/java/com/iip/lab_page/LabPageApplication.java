package com.iip.lab_page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LabPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPageApplication.class, args);
	}

}
