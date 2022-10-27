package com.example.demo.service;


public class Stock {

	private String stockName;
	private double stockPrice;
	
	public Stock(String name, double price)
	{
		this.stockName = name;
		this.stockPrice = price;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
}
