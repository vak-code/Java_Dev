package com.vishal.classobjects.objects;

import java.util.Objects;

public class InterestRate {

	private String intCode;
	private float intRate;
	private char intType;

	public void uplIntRates() {
		System.out.println("Int rates uploaded!");
	}

	public void modifyRate(String intCode) {
		System.out.println(intCode + " details modified");
	}

	public String getIntCode() {
		return intCode;
	}

	public void setIntCode(String intCode) {
		this.intCode = intCode;
	}

	public float getIntRate() {
		return intRate;
	}

	public void setIntRate(float intRate) {
		this.intRate = intRate;
	}

	public char getIntType() {
		return intType;
	}

	public void setIntType(char intType) {
		this.intType = intType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.intCode, this.intRate, this.intType);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;
		if (!(o instanceof InterestRate))
			return false;

		InterestRate temp = (InterestRate) o;
		return (this.intCode == temp.intCode && this.intRate == temp.intRate && this.intType == temp.intType);
	}

}
