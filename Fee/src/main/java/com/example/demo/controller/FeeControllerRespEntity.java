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

import com.example.demo.model.Fee;
import com.example.demo.service.FeeService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RequestMapping(value="resp")
@RestController
public class FeeControllerRespEntity {

	@Autowired
	FeeService feeService;
	
	@GetMapping("getfee")
	public ResponseEntity<Fee> getFee(@RequestParam(value="sort", defaultValue = "asc") String sorting)
	{
		log.info("CUSTOM log GET FEE with Query = " + sorting);
		return (new ResponseEntity<Fee>(feeService.getFeeSrvc(),HttpStatus.OK));
	}
	
	@GetMapping("getfee/{id}")
	public ResponseEntity<Fee> getFeePath(@PathVariable String id)
	{
		log.info("CUSTOM log GET FEE with PATH = " + id);
		return (new ResponseEntity<Fee>(feeService.getFeeSrvc(),HttpStatus.OK));
	}
	
	@GetMapping("error")
	public void getFeeError()
	{
		log.info("CUSTOM log GET FEE with Error");
		int i = 1/0;
		log.info("CUSTOM log Will not be printed");
	}
	
	@PostMapping("postfee")
	public ResponseEntity<String> postFee()
	{
		log.info("CUSTOM log POST FEE called");
		return (new ResponseEntity<String>(feeService.postFeeSrvc(),HttpStatus.CREATED));
	}
	
	@PutMapping("putfee")
	public ResponseEntity<String> putFee()
	{
		log.info("CUSTOM log PUT FEE called");
		return (new ResponseEntity<String>(feeService.putFeeSrvc(),HttpStatus.ACCEPTED));
	}
	
	@DeleteMapping("delfee")
	public ResponseEntity<String> deleteFee()
	{
		log.info("CUSTOM log DELETE FEE called");
		return (new ResponseEntity<String>(feeService.delFeeSrvc(),HttpStatus.ACCEPTED));
	}
}
