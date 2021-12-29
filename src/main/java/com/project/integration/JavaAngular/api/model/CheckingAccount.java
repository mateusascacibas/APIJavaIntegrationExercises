package com.project.integration.JavaAngular.api.model;

public class CheckingAccount {
	private int numCC;
	private double balanceCC;
	
	public void deposit(double value) {
		this.balanceCC += value;
	}
	
	public void toWithdraw(double value) {
		this.balanceCC -= value;
	}
	
	public void setBalance(double value) {
		this.balanceCC = value;
	}
	
	public double getBalance() {
		return this.balanceCC;
	}
	
	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}
	public double getNumCC() {
		return this.numCC;
	}
}
