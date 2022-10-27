package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Currency;
import com.example.demo.service.CurrencyService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
@RequestMapping(value="resp")
public class CurrencyControllerRespEntity {

	@Autowired
	CurrencyService currencyService;
	
	@GetMapping("curr")
	public ResponseEntity<Currency> getCurrency(@RequestParam(value="sort", defaultValue = "asc") String sortOrder)
	{
		log.info("CUSTOM LOG RS Get Currency with  sort order = " + sortOrder);
		return (new ResponseEntity<Currency>(currencyService.getCurrServ(),HttpStatus.OK));
	}
	
	@GetMapping("curr/{curr}")
	public ResponseEntity<Currency> getCurrencyPath(@PathVariable String curr)
	{
		log.info("CUSTOM LOG RS Get Currency with PATH = " + curr);
		return (new ResponseEntity<Currency>(currencyService.getCurrServ(),HttpStatus.OK));
	}
	
	@GetMapping("curr/error")
	public void getCurrencyError()
	{
		log.info("CUSTOM LOG Get Currency Exception called ");
		Currency curr = null;
		curr.getCurrency();
		log.info("CUSTOM LOG After the exception ");
	}
	
	@PostMapping("curr")
	public ResponseEntity<String> postCurrency()
	{
		log.debug("CUSTOM LOG RS Post currency called");
		return (new ResponseEntity<String>(currencyService.postCurrServ(),HttpStatus.CREATED));
	}
	
	@PutMapping("curr")
	public ResponseEntity<String> putCurrency()
	{
		log.warn("CUSTOM LOG RS Put currency called");
		return (new ResponseEntity<String>(currencyService.putCurrServ(),HttpStatus.ACCEPTED));
	}
	
	@DeleteMapping("curr")
	public ResponseEntity<String> deleteCurrency()
	{
		log.error("CUSTOM LOG RS Delete currency called ");
		return (new ResponseEntity<String>(currencyService.delCurrServ(),HttpStatus.ACCEPTED));
	}
}
