package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("ma.projet.entities")
public class School2Application {
	public static void main(String[] args) {
		SpringApplication.run(School2Application.class, args);
	}

}
