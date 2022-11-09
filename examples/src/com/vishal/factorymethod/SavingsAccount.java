package com.vishal.factorymethod;

public class SavingsAccount implements Account {

	@Override
	public void accountType() {
		System.out.println("Savings Account");
	}

}
