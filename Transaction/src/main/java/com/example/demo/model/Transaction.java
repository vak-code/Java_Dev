package com.example.demo.model;

public class Transaction {

	private int tranId;
	private double tranAmt;
	private String tranDate;
	
	public Transaction(int id, double amt, String date)
	{
		this.tranId = id;
		this.tranAmt = amt;
		this.tranDate = date;
	}

	public int getTranId() {
		return tranId;
	}

	public void setTranId(int tranId) {
		this.tranId = tranId;
	}

	public double getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(double tranAmt) {
		this.tranAmt = tranAmt;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
}
