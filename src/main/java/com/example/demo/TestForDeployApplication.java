package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestForDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestForDeployApplication.class, args);
		System.out.println("deploy test app starting");
	}

}
