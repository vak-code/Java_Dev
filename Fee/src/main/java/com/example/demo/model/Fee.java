package com.example.demo.model;

public class Fee {

	private String feeType;
	private double feeAmount;
	
	public Fee(String feeType, double feeAmount)
	{
		this.feeType = feeType;
		this.feeAmount = feeAmount;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}
	
	
}
