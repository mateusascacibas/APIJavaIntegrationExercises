package com.project.integration.JavaAngular.Model;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.model.Lamp;

public class LampTest {
	Lamp lamp = new Lamp();
	@Test
	public void testTurnOn() {
		lamp.turnOn();
	}
	
	@Test
	public void testTurnOnFalse() {
		lamp.turnOff();
		lamp.turnOn();
	}
	

	@Test
	public void testTurnOffFalse() {
		lamp.turnOff();
		lamp.turnOff();
	}
	
	@Test
	public void testTurnOff() {
		lamp.turnOff();
	}
	@Test
	public void testIsOn() {
		lamp.isOn();
	}
	
	@Test
	public void testIsOnFalse() {
		lamp.turnOff();
		lamp.isOn();
	}
	
	@Test
	public void testSetOn() {
		lamp.setOn(true);
	}
}
