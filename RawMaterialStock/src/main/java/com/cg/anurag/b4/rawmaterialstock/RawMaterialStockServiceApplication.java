package com.cg.anurag.b4.rawmaterialstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class RawMaterialStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RawMaterialStockServiceApplication.class, args);
	}

}
