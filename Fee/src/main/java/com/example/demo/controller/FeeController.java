package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Fee;
import com.example.demo.service.FeeService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class FeeController {
	
	@Autowired
	FeeService feeSrvc;
	
	@GetMapping("fee")
	public Fee getFee()
	{
		log.debug("custom debug get fee");
		return feeSrvc.getFeeSrvc();
	}
	
	@PostMapping("fee")
	public String postFee()
	{
		log.debug("custom debug post fee");
		return feeSrvc.postFeeSrvc();
	}
	
	@PutMapping("fee")
	public String putFee()
	{
		log.debug("custom debug put fee");
		return feeSrvc.putFeeSrvc();
	}
	
	@DeleteMapping("fee")
	public String delFee()
	{
		log.debug("custom debug delete fee");
		return feeSrvc.delFeeSrvc();
	}
	
	
	
	
	
	

}
