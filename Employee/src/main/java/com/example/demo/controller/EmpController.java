package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class EmpController {

	@Autowired
	EmpService empServ;

	@GetMapping("emp")
	public Employee getEmp() {
		log.debug("CUSTOM DEBUG get employee");
		return empServ.getEmpServ();

	}
	
	@PostMapping("emp")
	public String postEmp()
	{
		log.info("CUSTOM INFO post employee");
		return empServ.postEmpServ();
	}
	
	@PutMapping("emp")
	public String putEmp()
	{
		log.warn("CUSTOM WARN put employee");
		return empServ.putEmpServ();
	}
	
	@DeleteMapping("emp")
	public String delEmp()
	{
		log.error("CUSTOM ERR delete employee");
		return empServ.delEmpServ();
	}

}






