package com.jenkins.exmaple.springjenkinsexample;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsExampleApplication extends SpringBootServletInitializer{

	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsExampleApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application started...");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringJenkinsExampleApplication.class);
	}
	
	public static void main(String[] args) {
		logger.info("Application Execueted..");
		SpringApplication.run(SpringJenkinsExampleApplication.class, args);
	}

	@GetMapping("/testing")
	public String test()
	{
		return "Welocome to the Devops World....";
	}
	
	@GetMapping("/one")
	public String test1()
	{
		return "Welcome to the Java World....";
	}
	

	@GetMapping("/two")
	public String test2()
	{
		return "Welcome to the DXC";
	}
	
	
}
