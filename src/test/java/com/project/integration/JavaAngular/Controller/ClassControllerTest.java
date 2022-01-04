package com.project.integration.JavaAngular.Controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.integration.JavaAngular.api.controller.ClassController;

public class ClassControllerTest {
	
	@Autowired
	private ClassController controller = new ClassController();
	
	@Test
	public void exe1Test() {
		assertNotNull(controller.exe1(Mockito.anyString(), Mockito.anyInt(), Mockito.anyString(), Mockito.anyInt()));
	}
	@Test
	public void exe1TestException() {
		assertNotNull(controller.exe1(Mockito.anyString(), Mockito.anyInt(), Mockito.anyString(), Mockito.anyInt()));
	}
	
	@Test
	public void exe2Test() {
		assertNotNull(controller.exe2(Mockito.anyInt(), Mockito.anyString(), Mockito.anyDouble(),Mockito.anyInt(), Mockito.anyString(), Mockito.anyDouble()));
	}
	
	@Test
	public void exe3Test() {
		assertNotNull(controller.exe3(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt()));
	}
}
