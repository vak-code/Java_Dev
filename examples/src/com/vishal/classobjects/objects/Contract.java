package com.vishal.classobjects.objects;

import java.util.Date;

public class Contract {

	private int contractID;
	private Date expiry;
	
	public void extendContract()
	{
		System.out.println("Contract extended");
	}
	
	public void terminateContract()
	{
		System.out.println("Contract Terminated");
	}

	public int getContractID() {
		return contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

}
