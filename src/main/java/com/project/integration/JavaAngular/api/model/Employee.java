package com.project.integration.JavaAngular.api.model;

public class Employee {
	private int codEmployee;
	private String nameEmployee;
	private double SalaryMonthly;
	
	public Employee(int codEmployee, String nameEmployee, double SalaryMonthly) {
		this.codEmployee = codEmployee;
		this.nameEmployee = nameEmployee;
		this.SalaryMonthly = SalaryMonthly;
	}
	
	public Employee() {
		
	}
	
	public double getSalaryYearly() {
		return SalaryMonthly * 12;
	}
	
	public void setIncrease(double per) {
		
		this.SalaryMonthly += SalaryMonthly * (per / 100.0) ; 
	}
	
	public void setCodEmployee(int codEmployee) {
		this.codEmployee = codEmployee;
	}
	
	public int getCodEmployee() {
		return codEmployee;
	}
	
	public void setnameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	
	public String getNameEmployee() {
		return nameEmployee;
	}
	
	public double getSalaryMonthly() {
		return SalaryMonthly;
	}
	
	public void setSalaryMonthly(double SalaryMonthly) {
		this.SalaryMonthly = SalaryMonthly;
	}
	
}
