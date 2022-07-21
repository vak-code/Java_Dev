package com.vishal.classobjects;

public class EmpDeptObjects {

	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		
		emp1.setId(101);
		emp1.setTitle("Mr.");
		emp1.setFirstName("Smith");
		emp1.setLastName("Johnson");
		emp1.setDepartment("IT");
		
		System.out.println(emp1.getMailingName());
		System.out.println(emp1.getMailingName(true));
		System.out.println(emp1.getMailingName(false));
		System.out.println();
		
		Employee emp2 = new Employee(102,"Manager");
		
		System.out.println(emp2.getId());
		System.out.println(emp2.getJobTitle());
		System.out.println(emp2.getMailingName(false));
		System.out.println();
		
		Department dept = new Department("Finance","Pretty Jonas");
		
		System.out.println(dept.getName());
		System.out.println(dept.getMgrName());
		
	}
}
