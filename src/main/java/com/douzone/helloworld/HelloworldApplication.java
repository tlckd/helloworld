package com.douzone.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class HelloworldApplication {
	
	@RequestMapping("/")
	String home() {
		return "Hello World! Douzone";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	
}
