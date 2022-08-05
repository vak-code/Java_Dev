package com.vishal.classobjects.objects;

import java.util.Date;
import java.util.Objects;

public class Check {

	private int checkNum;
	private double amount;
	private Date expiryDate;
	private Customer cust;
	
	public void issueCheckBook()
	{
		System.out.println("Check book issued");
	}
	
	public void clearCheck()
	{
		System.out.println("Check cleared");
	}

	public int getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(int checkNum) {
		this.checkNum = checkNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public int hashCode()
	{
		return Objects.hash(this.checkNum, this.amount, this.cust, this.expiryDate);
	}
	
	
	
}
