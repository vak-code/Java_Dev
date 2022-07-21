package com.vishal.classobjects;

public class Employee {
	
	private int id;
	private String title;
	private String firstName;
	private String lastName;
	private String jobTitle;
	private String department;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String jobTitle)
	{
		this.id = id;
		this.jobTitle = jobTitle;
	}
	
	public Employee(int id, String title, String firstName, String lastName, String jobTitle, String department)
	{
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.department = department;
				
	}
	
	public String getMailingName()
	{
		return title+" "+firstName+" "+lastName;
	}
	
	public String getMailingName(boolean firstNameInitial)
	{
		if(firstNameInitial)
			return this.title+" "+this.firstName.substring(0,1)+" "+this.lastName;
		else
			return this.title+" "+this.lastName;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		if(firstName.length() <= 2)
			System.out.println("The length of the first name must be more than 2 chars");
		else
			this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getJobTitle()
	{
		return this.jobTitle;
	}
	
	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
}
