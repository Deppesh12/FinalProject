package com.cg.anurag.b4.inventorymanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class InventoryManagementSystemEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemEurekaServerApplication.class, args);
	}

}
