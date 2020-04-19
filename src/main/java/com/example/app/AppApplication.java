package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigurationProperties({Book.class})
//@ComponentScan(basePackages = {"com.example.app.controller","com.example.app","com.example.app.service.impl","com.example.app.dao","com.example.app.service"})
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
