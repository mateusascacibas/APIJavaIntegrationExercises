package com.project.integration.JavaAngular.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.service.VectorMatrixService;

public class VectorMatrixServiceTest {
	VectorMatrixService service = new VectorMatrixService();
	@Test
	public void exe1() {
		String response = service.exercise1(new int[]{1,2,3,4,5,6});
		System.out.println(response);
		assertEquals("Valor 1 = 1\nValor 2 = 2\nValor 3 = 3\nValor 4 = 4\nValor 5 = 5\nValor 6 = 6\n", response);
	}
}
