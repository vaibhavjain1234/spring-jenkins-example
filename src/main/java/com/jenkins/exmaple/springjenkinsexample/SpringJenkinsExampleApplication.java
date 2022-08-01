package com.jenkins.exmaple.springjenkinsexample;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsExampleApplication {

	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsExampleApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application started...");
	}
	
	
	public static void main(String[] args) {
		logger.info("Application Execueted..");
		SpringApplication.run(SpringJenkinsExampleApplication.class, args);
	}

}
