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
	
	public Elevator(int capacityElevator, int totalFloors, int currentFloor, int peopleInside) {
		this.capacityElevator = capacityElevator;
		this.totalFloors = totalFloors;
		this.currentFloor = currentFloor;
		this.peopleInside = peopleInside;
	}
	
	public void toGetIn() {
		if(this.peopleInside < this.capacityElevator) {
			this.peopleInside += 1;
		}
		else {
			System.out.println("Elevator is already full");
		}
	}
	
	public void toGetOut() {
		if(this.peopleInside > 0) {
			this.peopleInside -= 1;
		}
		else {
			System.out.println("Elevator is already empty");
		}
	}
	
	public void upload() {
		if(this.currentFloor < this.totalFloors) {
			this.currentFloor += 1;
		}
		else {
			System.out.println("Elevator is already on the top floor!");
		}
	}
	
	public void download() {
		if(this.currentFloor > 0) {
			this.currentFloor -= 1;
		}
		else {
			System.out.println("Elevator is already on the ground floor!");
		}
	}
	
	public String getInfo() {
		return getcurrentFloor() + "\n\n" + "Total Floors: " + gettotalFloors() + "\n\n" + getpeopleInside() + "\n\nCapacity: " + getcapacityElevator();
	}
	public int gettotalFloors() {
		return totalFloors;
	}
	public void settotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}
	public String getpeopleInside() {
		return "PeopleInside : " + peopleInside;
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
	public String getcurrentFloor() {
		return "Current floor : " + currentFloor;
	}
	public void setcurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
}
