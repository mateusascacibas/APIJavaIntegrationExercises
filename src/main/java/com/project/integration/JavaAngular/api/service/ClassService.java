package com.project.integration.JavaAngular.api.service;

import com.project.integration.JavaAngular.api.model.*;

public class ClassService {
	
	public String exercise1(String name1, String name2, int age1, int age2) {
		People p1 = new People(name1, age1);
		People p2 = new People(name2, age2);
		if (p1.getAge() > p2.getAge()) {
			return p1.getName() + " is the oldest.";
		} else if (age2 > age1) {
			return p2.getName() + " is the oldest.";
		} else {
			return "Both are the same age";
		}
	}

	public String exercise2(int codFunc1, String nameFunc1, double salaryMonth1,
			int codFunc2, String nameFunc2, double salaryMonth2 ) {
		Employee f01 = new Employee(codFunc1, nameFunc1, salaryMonth1);
		Employee f02 = new Employee(codFunc2, nameFunc2, salaryMonth2);
//		Precisa mostrar o antes e o depois do aumento.
		//		System.out.println(f01.getCodFunc() + "\t\t" + f01.getNameFunc() + "\t\t" + f01.getSalarioMensal());
//		F01.setAumento(15);
//		F02.setAumento(15);
		
//		System.out.println("\n Apos aumento ");
		
		return "Employee 1\nCod: " + f01.getCodEmployee() + " - Name: " + f01.getNameEmployee() + " - Salary: " + f01.getSalaryYearly() + 
				"\nEmployee 2\nCod: " + f02.getCodEmployee() + " - Name: " + f02.getNameEmployee() + " - Salary: " + f02.getSalaryYearly();	
	}
	
	public String exercise3(int capacityElevator, int totalFloors, int currentFloor, int peopleInside, int method) {
		Elevator elevator = new Elevator(capacityElevator, totalFloors, currentFloor, peopleInside );
		String response = "";
			switch (method) {
			case 1:
				elevator.toGetIn();
				response = elevator.getpeopleInside();
				break;
			case 2: 
				elevator.toGetOut();
				response = elevator.getpeopleInside();
				break;
			case 3:
				elevator.upload();
				response = elevator.getcurrentFloor();
				break;
			case 4:
				elevator.download();
				response = elevator.getcurrentFloor();
				break;
			case 5:
				elevator.getInfo();
				response = elevator.getInfo();
				break;
			case 0:
				response = "Saindo...";
				break;
			default:
				break;
			}
		
		return response;
	}
}
