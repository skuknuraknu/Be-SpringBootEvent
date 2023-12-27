package com.skuknuraknu.eventapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventappApplication {
	private static final Logger logger = LoggerFactory.getLogger(EventappApplication.class);

	public static void main(String[] args) {
		// testing comments
		SpringApplication.run(EventappApplication.class, args);
		logger.info("Application Started");
	}

}
