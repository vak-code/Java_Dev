package com.vishal.classobjects.objects;

public class Contact {

	private Customer custID;
	private String emailID;
	private long cellNumber;

	public Customer getCustID() {
		return custID;
	}

	public void setCustID(Customer custID) {
		this.custID = custID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public long getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(long cellNumber) {
		this.cellNumber = cellNumber;
	}

	public void verifyContact(Contact newContact)
	{
		System.out.println("Contact details verified");
	}
}
