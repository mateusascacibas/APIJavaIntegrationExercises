package com.project.integration.JavaAngular.api.model;

public class CheckingAccount {
	private int numCC;
	private double saldoCC;
	
	public void deposit(double value) {
		this.saldoCC += value;
	}
	
	public void toWithdraw(double value) {
		this.saldoCC -= value;
	}
	
	public void setBalance(double value) {
		this.saldoCC = value;
	}
	
	public double getBalance() {
		return this.saldoCC;
	}
	
	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}
	public double getNumCC() {
		return this.numCC;
	}
}
