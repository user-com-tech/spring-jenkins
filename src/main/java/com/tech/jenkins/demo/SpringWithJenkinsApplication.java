package com.tech.jenkins.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringWithJenkinsApplication.class);
	
	public  init() {
		logger.info("Application Started...");
	}
	public static void main(String[] args) {
		logger.info("Application Running...");
		SpringApplication.run(SpringWithJenkinsApplication.class, args);
	}

}
