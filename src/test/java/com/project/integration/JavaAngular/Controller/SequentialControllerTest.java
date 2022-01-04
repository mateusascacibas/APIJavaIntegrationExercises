package com.project.integration.JavaAngular.Controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.controller.SequentialController;

public class SequentialControllerTest {
	SequentialController controller = new SequentialController();
	@Test
	public void exe1() {
		assertNotNull(controller.exe1(20, 10));
	}
	
	@Test
	public void exe2() {
		assertNotNull(controller.exe2(20, 10,3,1));
	}
	
	@Test
	public void exe3() {
		assertNotNull(controller.exe3(20, 10,2));
	}
}
