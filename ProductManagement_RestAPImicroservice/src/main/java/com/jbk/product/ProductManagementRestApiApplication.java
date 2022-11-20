package com.jbk.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class ProductManagementRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementRestApiApplication.class, args);
	}
	
	@Bean
	public CommonsMultipartResolver commonsMultipartResolver() {
		return new CommonsMultipartResolver();
		
	}
	
	@Bean
	public RestTemplate restTemplate () {
		return new RestTemplate();
		
	}
}
