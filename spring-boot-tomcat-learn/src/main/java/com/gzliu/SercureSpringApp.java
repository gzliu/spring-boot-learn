package com.gzliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SercureSpringApp extends SpringBootServletInitializer{
	
	
	public static void main(String[] args) {
		SpringApplication.run(SercureSpringApp.class, args);
	}

	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(SercureSpringApp.class);
	}
	
}
