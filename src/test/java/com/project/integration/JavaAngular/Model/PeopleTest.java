package com.project.integration.JavaAngular.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.model.People;

public class PeopleTest {
	People people = new People();
	People people2 = new People("Mateus", 19);
	People people3 = new People("Mateus", "Test 3", 1234);
	

	@Test
	public void getAgeTest() {
		people.setAge(2);
		assertNotNull(people2.getAge());
	}
	
	@Test
	public void getPhoneTest() {
		assertNotNull(people2.getPhone());
	}
	
	@Test
	public void getNameTest() {
		assertNotNull(people2.getName());
	}
	@Test
	public void getAddressTest() {
		assertNotNull(people3.getAddress());
	}
	@Test
	public void imprimirTest() {
		assertEquals("Name: Mateus Adress: Test 3 Phone: 1234\n", people3.imprimir());
	}
	
}
