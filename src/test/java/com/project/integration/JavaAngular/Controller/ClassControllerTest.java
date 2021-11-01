package com.project.integration.JavaAngular.Controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.controller.ClassController;
import com.project.integration.JavaAngular.api.service.ClassService;

public class ClassControllerTest {
	ClassService service = new ClassService();
	
	ClassController controller = new ClassController();
	@Test
	public void exe1TestP2() {
		assertNotNull(controller.exe1("Mateus", 19, "Tiago", 20));
	}
	
	@Test
	public void exe1TestP1() {
		assertNotNull(controller.exe1("Mateus", 20, "Tiago", 19));
	}
	
	@Test
	public void exe1TestEquals() {
		assertNotNull(controller.exe1("Mateus", 19, "Tiago", 19));
	}
	
	@Test
	public void exe3Test() {
		assertNotNull(controller.exe3(1,"Mateus", 1200, 2, "Tiago", 1200));
	}
}
