package com.cg.anurag.b4.productstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ProductStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductStockServiceApplication.class, args);
	}

}
