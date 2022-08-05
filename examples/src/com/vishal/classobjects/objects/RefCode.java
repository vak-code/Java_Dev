package com.vishal.classobjects.objects;

import java.util.Objects;

public class RefCode {
	
	private String refCode;
	private String refType;
	private String refValue;

	public void createRefCode()
	{
		System.out.println("Refecerence Code created!!");
	}
	
	public void deleteRefCode()
	{
		System.out.println("Reference code deleted");
	}

	public String getRefCode() {
		return refCode;
	}

	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	public String getRefType() {
		return refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	public String getRefValue() {
		return refValue;
	}

	public void setRefValue(String refValue) {
		this.refValue = refValue;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.refCode);
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		if(o == this)
			return true;
		if(!(o instanceof RefCode))
			return false;
		
		RefCode temp = (RefCode) o;
		
		return (this.refCode.equals(temp.refCode) && this.refType.equals(temp.refType) && this.refValue.equals(temp.refValue));
	}
}
