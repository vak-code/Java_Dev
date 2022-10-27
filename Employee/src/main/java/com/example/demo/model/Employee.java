package com.example.demo.model;

public class Employee {

	private int empId;
	private String empRole;
	
	public Employee(int empId, String empRole)
	{
		this.empId = empId;
		this.empRole = empRole;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
}
