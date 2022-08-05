package com.vishal.classobjects.objects;

public class Account {

	private int acctID;
	private String acctType;
	private double balance;
	
	Account(int id, String type)
	{
		this.acctID = id;
		this.acctType = type;
		this.balance = 0.0;
	}

	public int getAcctID() {
		return acctID;
	}

	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void closeAccount()
	{
		System.out.println("Account Closed");
	}

}
