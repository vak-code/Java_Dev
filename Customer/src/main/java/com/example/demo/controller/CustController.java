package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class CustController {

	@Autowired
	CustService custService;
	
	@GetMapping("cust")
	public Customer getCust()
	{
		log.info("CUSTOM log INFO Get Cust");
		return custService.getCustService();
	}
	
	@PostMapping("cust")
	public String postCust()
	{
		log.debug("CUSTOM log DEBUG Post Cust");
		return custService.postCustService();
	}
	
	@PutMapping("cust")
	public String putCust()
	{
		log.warn("CUSTOM log WARN Put Cust");
		return custService.putCustService();
	}
	
	@DeleteMapping("cust")
	public String delCust()
	{
		log.error("CUSTOM log ERROR Cust Delete");
		return custService.delCustService();
	}
}
