package com.jenkins.exmaple.springjenkinsexample;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsExampleApplicationTests {

	public  Logger logger=LoggerFactory.getLogger(SpringJenkinsExampleApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test Case Executing...");
		assertEquals(true, true);
	}

}
