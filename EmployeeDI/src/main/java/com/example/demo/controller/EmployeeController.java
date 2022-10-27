package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeInterface;

@RestController
public class EmployeeController {

	@Qualifier("contract")
	@Autowired
	EmployeeInterface emp;
	
	@GetMapping
	public String getEmployee()
	{
		return emp.employeeType();
	}
	
}
