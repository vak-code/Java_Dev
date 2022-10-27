package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmpService {

	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	public Employee getEmpServ() {
		//return "GET from Service";
		return new Employee(10123,"Tech Architect");
	}

	public String postEmpServ() {
		return postMsg;
	}

	public String putEmpServ() {
		return env.getProperty("putMsg");
	}

	public String delEmpServ() {
		return env.getProperty("delMsg");
	}

}
