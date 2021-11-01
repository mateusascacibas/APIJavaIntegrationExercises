package com.project.integration.JavaAngular.Controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.controller.VectorMatrixController;

public class VectorMatrixControllerTest {
	VectorMatrixController controller = new VectorMatrixController();
	@Test
	public void exe1() {
		assertNotNull(controller.exe1(new int[]{1,2,3,4,5,6}));
	}
}
