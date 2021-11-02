package com.project.integration.JavaAngular.Model;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.model.Employee;

public class EmployeeTest {
	Employee emp = new Employee();
	@Test
	public void setTest() {
		emp.setSalaryMonthly(1200);
		emp.setIncrease(19);
		emp.setCodEmployee(1);
		emp.setnameEmployee("Mateus");
	}
	
	@Test
	public void getTest() {
		emp.getCodEmployee();
		emp.getNameEmployee();
		emp.getSalaryMonthly();
		emp.getSalaryYearly();
	}
}
