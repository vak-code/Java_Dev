package com.vishal.classobjects.objects;

public class Interest {

	private double intAmt;
	private float intRate;
	private Account account;
	
	Interest()
	{
		intAmt = 0;
		intRate = 0;
	}
	
	public double getIntAmt() {
		return intAmt;
	}
	
	public float getIntRate() {
		return intRate;
	}
	public void setIntRate(float intRate) {
		this.intRate = intRate;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void calcInt()
	{
		double acctBal = account.getBalance();
		intAmt = (acctBal * intRate) / (100);
		System.out.println("Interest calculated successfully");
	}
	
}
