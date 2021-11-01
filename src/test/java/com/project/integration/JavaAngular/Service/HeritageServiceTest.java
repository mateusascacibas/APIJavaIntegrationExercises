package com.project.integration.JavaAngular.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.service.HeritageService;

public class HeritageServiceTest {
	HeritageService service = new HeritageService();
	@Test
	public void exe1Test() {
		String response = "Name: Mateus Adress: Rua Ascacibas Phone: 987654321\nName: Tiago Adress: Rua Rodrigues Phone: 123456789\n";
		assertEquals(response, service.exercise1().toString());
	}
}
