package com.project.integration.JavaAngular.Model;

import org.junit.jupiter.api.Test;

import com.project.integration.JavaAngular.api.model.CheckingAccount;

public class CheckingAccountTest {
	CheckingAccount ca = new CheckingAccount();
	
	@Test
	public void setTest() {
		ca.setBalance(200);
		ca.setNumCC(14);
		ca.deposit(20);
		ca.toWithdraw(20);
	}
	
	@Test
	public void getTest() {
		ca.getBalance();
		ca.getNumCC();
	}
}
