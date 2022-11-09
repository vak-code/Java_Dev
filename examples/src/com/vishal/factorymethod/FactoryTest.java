package com.vishal.factorymethod;

public class FactoryTest {

	public static void main(String[] args) {
		
		try {
		Factory factoryObject = new Factory();
		
		Account accountObject = factoryObject.getAccount("Savings");
		accountObject.accountType();
		
		accountObject = factoryObject.getAccount("Loan");
		accountObject.accountType();
		
		accountObject = factoryObject.getAccount(null);
		accountObject.accountType();
		
		accountObject = factoryObject.getAccount("SBA");
		accountObject.accountType();
		

		
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
