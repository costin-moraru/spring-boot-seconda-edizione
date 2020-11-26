package com.example.client1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableScheduling
@EnableWebMvc
public class Client1Application {
	
	private final Logger log = LoggerFactory.getLogger(Client1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Client1Application.class, args);
	}


}
