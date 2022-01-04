package com.project.integration.JavaAngular.Service;

import static org.junit.Assert.assertNotNull;
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
		assertEquals("Tiago is the oldest.", bigger);
	}

	@Test
	public void exe1TestP1() {
		String bigger = service.exercise1("Mateus", "Tiago", 20, 19).toString();
		assertEquals("Mateus is the oldest.", bigger);
	}

	@Test
	public void exe1TestEquals() {
		String bigger = service.exercise1("Mateus", "Tiago", 20, 20).toString();
		assertEquals("Both are the same age", bigger);
	}

	@Test
	public void exe2Test() {
		String maior = service.exercise2(1, "Mateus", 1200, 2, "Tiago", 1200).toString();
		assertEquals(
				"Employee 1\nCod: 1 - Name: Mateus - Salary: 14400.0\nEmployee 2\nCod: 2 - Name: Tiago - Salary: 14400.0",
				maior);
	}
	
	@Test
	public void exe3TestCase1() {
		String response = service.exercise3(3, 3, 3, 3, 1);
		assertEquals("PeopleInside : 3", response);
	}
	
	@Test
	public void exe3TestCase2() {
		String response = service.exercise3(2, 2, 2, 2, 2);
		assertEquals("PeopleInside : 1", response);
	}
	
	@Test
	public void exe3TestCase3() {
		String response = service.exercise3(2, 2, 2, 2, 3);
		assertEquals("Current floor : 2", response);
	}
	
	@Test
	public void exe3TestCase4() {
		String response = service.exercise3(2, 2, 2, 2, 4);
		assertEquals("Current floor : 1", response);
	}
	
	@Test
	public void exe3TestCase5() {
		String response = service.exercise3(3, 3, 3, 3, 5);
		assertNotNull(response);
	}
}
