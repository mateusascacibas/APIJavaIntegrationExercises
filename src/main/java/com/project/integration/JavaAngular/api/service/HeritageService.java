package com.project.integration.JavaAngular.api.service;

import com.project.integration.JavaAngular.api.model.People;

public class HeritageService {
	
	public String exercise1() {
		People p1 = new People();
		p1.setName("Mateus");
		p1.setAddress("Rua Ascacibas");
		p1.setPhone(987654321);
		People p2= new People("Tiago", "Rua Rodrigues", 123456789);
		return p1.imprimir() + p2.imprimir();
	}
	
	public String exercise2() {
		return null;
	}
	
	public String exercise3() {
		return null;
	}
	
}
