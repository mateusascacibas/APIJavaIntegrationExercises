package com.project.integration.JavaAngular.Controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.controller.HeritageController;

public class HeritageControllerTest {
	HeritageController controller = new HeritageController();
	@Test
	public void exe1Test() {
		assertNotNull(controller.exe1());
	}
}
