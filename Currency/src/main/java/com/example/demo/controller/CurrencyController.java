package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Currency;
import com.example.demo.service.CurrencyService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class CurrencyController {
	
	@Autowired
	CurrencyService currServ;
	
	@GetMapping("curr")
	public Currency getCurr()
	{
		log.info("CUSTOM GET currency");
		return currServ.getCurrServ();
	}
	
	@PostMapping("curr")
	public String postCurr()
	{
		log.debug("CUSTOM POST curency");
		return currServ.postCurrServ();
	}
	
	@PutMapping("curr")
	public String putCurr()
	{
		log.warn("CUSTOM PUT currency");
		return currServ.putCurrServ();
	}
	
	@DeleteMapping("curr")
	public String delCurr()
	{
		log.error("CUSTOM DELETE currency");
		return currServ.delCurrServ();
	}
	
	

}






