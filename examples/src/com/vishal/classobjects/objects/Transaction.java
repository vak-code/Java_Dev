package com.vishal.classobjects.objects;

public class Transaction {

	private String tranID;
	private double tranAmt;
	private char tranType;
	private Account account;

	public String getTranID() {
		return tranID;
	}

	public void setTranID(String tranID) {
		this.tranID = tranID;
	}

	public double getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(double tranAmt) {
		this.tranAmt = tranAmt;
	}

	public char getTranType() {
		return tranType;
	}

	public void setTranType(char tranType) {
		this.tranType = tranType;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void postTran(double amount, char type) {
		if (type == 'C') {
			account.setBalance(account.getBalance() + amount);
			System.out.println("Transaction Posted Sucessfully");
		} else if (type == 'D') {
			account.setBalance(account.getBalance() - amount);
			System.out.println("Transaction Posted Sucessfully");
		} else
			System.out.println("Invalid Transaction Type!!");
	}

}
