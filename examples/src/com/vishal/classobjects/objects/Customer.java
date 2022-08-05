package com.vishal.classobjects.objects;

public class Customer {

	private String firstName;
	private String lastName;
	
	public void addCustomer()
	{
		System.out.println("Customer added!");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
