package com.soares.costumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CostumerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerConfigServerApplication.class, args);
	}
}
