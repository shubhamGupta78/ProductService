package com.scaler.com.scaler.ProductService;

import com.scaler.com.scaler.ProductService.Models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);


		//Product product = new Product();

		//product.getid();
	}


}
