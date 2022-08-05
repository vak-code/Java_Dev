package com.vishal.classobjects.objects;

public class Collateral {

	private int collID;
	private String collType;

	public void attachCollateral() {
		System.out.println("Collateral successfully attached to an account");
	}

	public int getCollID() {
		return collID;
	}

	public void setCollID(int collID) {
		this.collID = collID;
	}

	public String getCollType() {
		return collType;
	}

	public void setCollType(String collType) {
		this.collType = collType;
	}

}
