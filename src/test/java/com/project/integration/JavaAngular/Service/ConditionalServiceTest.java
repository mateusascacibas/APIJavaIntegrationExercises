package com.project.integration.JavaAngular.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.service.ConditionalService;

public class ConditionalServiceTest {
	ConditionalService service = new ConditionalService();

	@Test
	public void exe1Test() {
		assertEquals("Negative.", service.exercise1(-2));
	}
	
	@Test
	public void exe2Test() {
		assertEquals("Pair", service.exercise2(2));
	}
	
	@Test
	public void exe3Test() {
		assertEquals("Are not multiple.", service.exercise3(5,7));
	}
	@Test
	public void exe4Test() {
		assertEquals("Duration: 2 hours.", service.exercise4(12, 14));
	}
	
}
