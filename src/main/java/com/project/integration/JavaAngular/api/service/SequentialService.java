package com.project.integration.JavaAngular.api.service;

public class SequentialService {
	public String exercise1(int n1, int n2) {
			return "Sum: " + (n1 + n2);
	}
	
	public String exercise2(int n1, int n2, int n3, int n4) {
		return "Difference: " + (n1 * n2 - n3 * n4);
	}
	
	public String exercise3(int num, int hours, double salary) {
		return "Number = " + num + "\nSalary = R$ " + hours * salary;
	}
}
