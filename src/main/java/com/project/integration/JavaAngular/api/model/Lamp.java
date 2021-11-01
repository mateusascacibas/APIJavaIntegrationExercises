package com.project.integration.JavaAngular.api.model;

public class Lamp {
	private boolean on;
	private String status;
	
	public Lamp() {
		this.on = true;
	}
	
	public void turnOn() {
		if(this.on) {
			System.out.println("Lampada ja esta ligada!");
		}
		else {
			this.on = true;
		}
	}
	
	public void turnOff() {
		if(!this.on) {
			System.out.println("Lampada ja esta desligada");
		}
		else {
			this.on = false;
		}
	}
	public void isOn() {
		if(this.on) {
			status = "on";
		}
		else {
			status = "off";
		}
		System.out.println("Lampada atualmente esta: " +  status);
		
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	
}
