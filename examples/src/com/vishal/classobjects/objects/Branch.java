package com.vishal.classobjects.objects;

public class Branch {

	private String brCode;
	private String brName;
	Address brAddress;

	public String getBrCode() {
		return brCode;
	}

	public void setBrCode(String brCode) {
		this.brCode = brCode;
	}

	public String getBrName() {
		return brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	public Address getBrAddress() {
		return brAddress;
	}

	public void setBrAddress(Address brAddress) {
		this.brAddress = brAddress;
	}

	public void modifyBranch()
	{
		System.out.println("Branch details updated");
	}
}
