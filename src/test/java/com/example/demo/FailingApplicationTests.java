package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@SpringBootTest
class FailingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void failingTest() {
		Assertions.assertTrue(FALSE);
	}


}
