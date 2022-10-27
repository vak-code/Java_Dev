package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.service.EmployeeInterface;

@Qualifier("contract")
@Component
public class ContractEmployee implements EmployeeInterface {

	@Override
	public String employeeType() {
		return "Contract Employee";
	}

}
