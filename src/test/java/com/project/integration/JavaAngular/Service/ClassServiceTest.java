package com.project.integration.JavaAngular.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.controller.ClassController;
import com.project.integration.JavaAngular.api.service.ClassService;

public class ClassServiceTest {
	ClassService service = new ClassService();

	ClassController controller = new ClassController();

	@Test
	public void exe1TestP2() {
		String bigger = service.exercise1("Mateus", "Tiago", 19, 21).toString();
		assertEquals("O(A) Tiago e o mais velho(a).", bigger);
	}

	@Test
	public void exe1TestP1() {
		String bigger = service.exercise1("Mateus", "Tiago", 20, 19).toString();
		assertEquals("O(A) Mateus e o mais velho(a).", bigger);
	}

	@Test
	public void exe1TestEquals() {
		String bigger = service.exercise1("Mateus", "Tiago", 20, 20).toString();
		assertEquals("Mesma idade", bigger);
	}

	@Test
	public void exe2Test() {
		String maior = service.exercise2(1, "Mateus", 1200, 2, "Tiago", 1200).toString();
		assertEquals(
				"Employee 1\nCod: 1 - Name: Mateus - Salary: 14400.0\nEmployee 2\nCod: 2 - Name: Tiago - Salary: 14400.0",
				maior);
	}
}
