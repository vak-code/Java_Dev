package com.example.demo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.service.EmployeeInterface;

@Primary
@Component
public class RegularEmployee implements EmployeeInterface {

	@Override
	public String employeeType() {
		return "Regular Employee";
	}

}
