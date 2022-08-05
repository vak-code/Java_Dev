package com.vishal.classobjects.objects;

public class Employee {

	private int empID;
	private String name;
	private String role;
	private double salary;
	
	public void hireEmp()
	{
		System.out.println("Employee added");
	}
	
	public void promoteEmp()
	{
		System.out.println("Promoted!");
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
