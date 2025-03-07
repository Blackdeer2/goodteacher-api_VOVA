package com.goodteacher.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// TODO: 23-11-2023, Vladyslav: Provide security configuration in SpringBoot
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TeacherAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(TeacherAppApplication.class, args);
	}
}
