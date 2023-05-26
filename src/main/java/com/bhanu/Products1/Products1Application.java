package com.bhanu.Products1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Products1Application {

	public static void main(String[] args) {
		SpringApplication.run(Products1Application.class, args);
	}

	@GetMapping("/")
	public String apiRoot(){
		return "Hello, world!";
	}

}
