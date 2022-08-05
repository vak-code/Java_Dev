package com.vishal.classobjects.objects;

public class Currency {

	private String crncyCode;
	private double exchangeRate;
	private String homeCrncy;
	
	public void exchangeCrncy()
	{
		System.out.println("Currency exchanged");
	}
	
	public void uploadRates()
	{
		System.out.println("Rates uploaded");
	}

	public String getCrncyCode() {
		return crncyCode;
	}

	public void setCrncyCode(String crncyCode) {
		this.crncyCode = crncyCode;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getHomeCrncy() {
		return homeCrncy;
	}

	public void setHomeCrncy(String homeCrncy) {
		this.homeCrncy = homeCrncy;
	}
	
	
	
}
