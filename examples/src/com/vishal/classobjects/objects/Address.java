package com.vishal.classobjects.objects;

public class Address {

	private String streetNo;
	private String city;
	private String State;
	private long pinCode;

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	public void modifyAddress()
	{
		System.out.println("Address details updated!");
	}

}
