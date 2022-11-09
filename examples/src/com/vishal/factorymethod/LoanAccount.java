package com.vishal.factorymethod;

public class LoanAccount implements Account {

	@Override
	public void accountType() {
		System.out.println("Loan Account");
	}

}
