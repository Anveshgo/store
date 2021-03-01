package com.store.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.store.*")
@EntityScan("com.store.*")
public class Store {
	public static void main(String[] args) {
		SpringApplication.run(Store.class, args);
	}
}
