package com.vishal.classobjects.objects;

import java.util.Objects;

public class Bank {

	private int bankID;
	private String bankName;

	public int getBankID() {
		return bankID;
	}

	public void setBankID(int bankID) {
		this.bankID = bankID;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void addProducts()
	{
		System.out.println("New product addedd successfully!!");
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.bankID, this.bankName);
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		if(!(o instanceof Bank))
			return false;
		if(this == o)
			return true;
		
		Bank temp = (Bank) o;
		return(this.bankID == temp.bankID && this.bankName == temp.bankName);
	}
}
