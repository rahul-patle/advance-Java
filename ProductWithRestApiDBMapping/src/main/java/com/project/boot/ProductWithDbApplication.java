package com.project.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class ProductWithDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductWithDbApplication.class, args);
	}



}
