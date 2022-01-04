package com.project.integration.JavaAngular.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.project.integration.JavaAngular.api.service.LoopService;

public class LoopServiceTest {
	@Mock
	LoopService service = new LoopService();
	@Test
	public void exe1Test() { 
		String response = service.exercise1(3);
		assertEquals("1\n3\n", response);
	}
}
