package com.project.integration.JavaAngular.Controller;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.integration.JavaAngular.api.controller.LoopController;

public class LoopControllerTest {
	@Autowired
	LoopController controller = new LoopController();
	@Test
	public void exe1Test() {
		assertNotNull(controller.exe1(Mockito.anyInt()));
	}
}
