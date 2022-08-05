package com.vishal.classobjects.objects;

public class Vendor {
	
	private int vendorID;
	private Contract contract;
	
	public void raiseTicket()
	{
		System.out.println("Ticket raised with vendor");
	}
	
	public void payVendor()
	{
		System.out.println("Vendor payment done");
	}

	public int getVendorID() {
		return vendorID;
	}

	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	
}
