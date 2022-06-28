package com.example.jenkinintegrationdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinIntegrationDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinIntegrationDemoApplicationTests.class);

	@Test
public void contextLoads() {
		logger.info("test case is executing....");
assertEquals(true,true);
	}

}
