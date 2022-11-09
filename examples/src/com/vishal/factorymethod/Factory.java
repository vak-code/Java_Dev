package com.vishal.factorymethod;

public class Factory {
	public Account getAccount(String accountType) throws Exception
	{
		if(accountType == null)
			throw new Exception();
		
		switch(accountType)
		{
		case "Savings":
			return new SavingsAccount();
		case "Loan":
			return new LoanAccount();
		default:
			throw new Exception();
		}
		
	}
}
