package com.project.integration.JavaAngular.Model;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.model.Elevator;

public class ElevatorTest {
	Elevator elevator = new Elevator(2, 2);
	@Test
	public void toGetOutTest() {
		elevator.toGetOut();
	}
	@Test
	public void toGetOutTest2() {
		elevator.setpeopleInside(2);
		elevator.toGetOut();
	}
	
	@Test
	public void toGetInTest() {
		elevator.toGetIn();
	}
	
	@Test
	public void toGetInTest2() {
		elevator.setpeopleInside(2);
		elevator.toGetIn();
	}
	
	
	@Test
	public void uploadTest() {
		elevator.setcurrentFloor(2);
		elevator.settotalFloors(2);
		elevator.upload();
	}
	

	@Test
	public void uploadTest2() {
		elevator.upload();
	}
	@Test
	public void downloadTest2() {
		elevator.setcurrentFloor(2);
		elevator.download();
	}
	@Test
	public void downloadTest() {
		elevator.download();
	}
	
	@Test
	public void getInfoTest() {
		elevator.getInfo();
	}
	
	@Test
	public void gettotalFloorsTest() {
		elevator.gettotalFloors();
	}
	
	@Test
	public void settotalFloorsTest() {
		elevator.settotalFloors(2);
	}
	
	@Test
	public void setpeopleInsideTest() {
		elevator.setpeopleInside(2);
	}
	
	@Test
	public void getcapacityElevatorTest() {
		elevator.getcapacityElevator();
	}
	
	@Test
	public void setcapacityElevatorTest() {
		elevator.setcapacityElevator(2);
	}
	
	@Test
	public void getcurrentFloorTest() {
		elevator.getcurrentFloor();
	}
	
	@Test
	public void setcurrentFloorTest() {
		elevator.setcurrentFloor(2);
	}
}
