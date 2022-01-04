package com.project.integration.JavaAngular.Service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.service.SequentialService;

public class SequentialServiceTest {
	SequentialService service = new SequentialService();
	@Test
	public void exe1Test() {
		String response = service.exercise1(2, 3).toString();
		assertEquals("Sum: 5", response);
	}
	
	@Test
	public void exe2Test() {
		String response = service.exercise2(1, 2, 3, 4);
		assertEquals("Difference: -10",response);
	}
	
	@Test
	public void exe3Test() {
		String response = service.exercise3(2, 10, 15);
		assertNotNull(response);
	}
}
