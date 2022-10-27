package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bank;
import com.example.demo.service.BankService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class BankController {
	
	@Autowired
	BankService bankSrvc;
	
//	@GetMapping("bank")
//	public Bank getBank()
//	{
//		log.info("Get Bank Info");
//		return bankSrvc.getBankSrvc();
//	}
	
	@GetMapping("bank")
	public ResponseEntity<Bank> getBankResponseEntity()
	{
		//Bank bank = bankSrvc.getBankSrvc();
		//ResponseEntity<Bank> responseEntity = new ResponseEntity<Bank>(bank,HttpStatus.OK);
		log.info("Get Bank Info");
		//return responseEntity;
		return (new ResponseEntity<Bank>(bankSrvc.getBankSrvc(),HttpStatus.OK));
	}
	
//	@PostMapping("bank")
//	public String postBank()
//	{
//		log.debug("Post Bank Debug");
//		return bankSrvc.postBankSrvc();
//	}
	
	
	@PostMapping("bank")
	public ResponseEntity<String> postBank()
	{
		log.debug("Post Bank Debug");
		//return bankSrvc.postBankSrvc();
		return(new ResponseEntity<String>(bankSrvc.postBankSrvc(),HttpStatus.CREATED));
	}
	
	@PutMapping("bank")
	public String putBank()
	{
		log.warn("Put Bank Warning");
		return bankSrvc.putBankSrvc();
	}
	
	@DeleteMapping("bank")
	public String deleteBank()
	{
		log.error("Delete Bank Error");
		return bankSrvc.delBankSrvc();
	}
}