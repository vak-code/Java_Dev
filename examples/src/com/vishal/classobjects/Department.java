package com.vishal.classobjects;

//Creating Department class
public class Department {
	
	private String name;
	private String mgrName;
	
	public Department(String name, String mgrName)
	{
		this.name = name;
		this.mgrName = mgrName;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getMgrName()
	{
		return this.mgrName;
	}

	
}
