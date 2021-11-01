package com.project.integration.JavaAngular.Controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.controller.ConditionalController;
import com.project.integration.JavaAngular.api.service.ConditionalService;

public class ConditionalControllerTest {
	
	ConditionalService service = new ConditionalService();
	ConditionalController controller = new ConditionalController();

	
	@Test
	public void exe1Test() {
		assertNotNull(controller.exe1(1));
	}
	
	@Test
	public void exe2Test() {
		assertNotNull(controller.exe2(1));
	}
	
	@Test
	public void exe3Test() {
		assertNotNull(controller.exe3(4,2));
	}
	
	@Test
	public void exe4Test() {
		assertNotNull(controller.exe4(20,10));
	}
}
