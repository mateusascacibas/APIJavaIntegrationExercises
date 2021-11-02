package com.project.integration.JavaAngular.api.model;

public class Elevator {
	private int currentFloor;
	private int totalFloors;
	private int capacityElevator;
	private int peopleInside;
	
	public Elevator(int capacityElevator, int totalFloors) {
		this.capacityElevator = capacityElevator;
		this.totalFloors = totalFloors;
		this.currentFloor = 0;
		this.peopleInside = 0;
	}
	
	public void toGetIn() {
		if(this.peopleInside < this.capacityElevator) {
			this.peopleInside += 1;
		}
		else {
			System.out.println("Elevador cheio!");
		}
	}
	
	public void toGetOut() {
		if(this.peopleInside > 0) {
			this.peopleInside -= 1;
		}
		else {
			System.out.println("Elevador ja esta vazio!");
		}
	}
	
	public void upload() {
		if(this.currentFloor < this.totalFloors) {
			this.currentFloor += 1;
		}
		else {
			System.out.println("Elevador ja esta no ultimo andar!");
		}
	}
	
	public void download() {
		if(this.currentFloor > 0) {
			this.currentFloor -= 1;
		}
		else {
			System.out.println("Elevador ja esta no terreo!");
		}
	}
	
	public void getInfo() {
		System.out.println("Andar Atual: " + getcurrentFloor() + "\nTotal de Andares: " + gettotalFloors() + "\nPessoas no elevador: " + getpeopleInside() + "\nCapacidade: " + getcapacityElevator());
	}
	public int gettotalFloors() {
		return totalFloors;
	}
	public void settotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}
	public int getpeopleInside() {
		return peopleInside;
	}
	public void setpeopleInside(int peopleInside) {
		this.peopleInside = peopleInside;
	}
	public int getcapacityElevator() {
		return capacityElevator;
	}
	public void setcapacityElevator(int capacityElevator) {
		this.capacityElevator = capacityElevator;
	}
	public int getcurrentFloor() {
		return currentFloor;
	}
	public void setcurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
}
