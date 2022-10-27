package com.example.demo.model;

public class Customer {

	private String custFirstName;
	private String custLastName;
	
	public Customer(String firstName, String lastName)
	{
		this.custFirstName = firstName;
		this.custLastName = lastName;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	
	
	
	
}
