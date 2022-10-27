package com.example.demo.model;

public class Flight {

	int flightNumber;
	String fromCity;
	String toCity;

	public Flight(int flight, String fromCity, String toCity) {
		this.flightNumber = flight;
		this.fromCity = fromCity;
		this.toCity = toCity;

	}

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

}
