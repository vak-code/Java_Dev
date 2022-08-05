package com.vishal.classobjects.objects;

public class Fees {

	private String feeType;
	private double feeAmt;

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public double getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(double feeAmt) {
		this.feeAmt = feeAmt;
	}

	public void collectFees(Account account)
	{
		double acctBal = account.getBalance();
		acctBal = acctBal - feeAmt;
		account.setBalance(acctBal);
		System.out.println("Fees collected successfully from the account : " + account.getAcctID());
	}
}
