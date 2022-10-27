package com.example.demo.model;

public class Currency {

	private String currency;
	private double rate;
	
	public Currency(String currency, double rate)
	{
		this.currency = currency;
		this.rate = rate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
}
