package com.example.client2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class Client2Application {
	
	private final Logger log = LoggerFactory.getLogger(Client2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Client2Application.class, args);
	}

}
