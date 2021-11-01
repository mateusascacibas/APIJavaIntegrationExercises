package com.project.integration.JavaAngular.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.service.SequentialService;

public class SequentialServiceTest {
	SequentialService service = new SequentialService();
	@Test
	public void exe1Test() {
		String response = service.exercise1(2, 3).toString();
		assertEquals("Soma: 5", response);
	}
}
