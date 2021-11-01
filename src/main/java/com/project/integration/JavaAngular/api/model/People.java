package com.project.integration.JavaAngular.api.model;

public class People {
	private String name;
	private int age;
	private String address;
	private int phone;

	public People() {

	}

	public People(String name, String address, int phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String imprimir() {
		return "Name: " + this.name + " Adress: " + this.address + " Phone: " + this.phone + "\n";
	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
}
