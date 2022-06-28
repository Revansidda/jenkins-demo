package com.example.jenkinintegrationdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinIntegrationDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinIntegrationDemoApplication.class);

	@PostConstruct
	public void initt() {
	logger.info("application started......");

	}

	public static void main(String[] args) {
		logger.info("application Executed......");
		SpringApplication.run(JenkinIntegrationDemoApplication.class, args);
	}

}
