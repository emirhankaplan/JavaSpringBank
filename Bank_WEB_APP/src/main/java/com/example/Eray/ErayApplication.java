package com.example.Emirhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.Emirhan.model")
public class EmirhanApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmirhanApplication.class, args);
	}
}