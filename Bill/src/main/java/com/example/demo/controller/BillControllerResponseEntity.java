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

import com.example.demo.model.Bill;
import com.example.demo.service.BillService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RequestMapping(value="/resp")
@RestController
public class BillControllerResponseEntity {

	@Autowired
	BillService billService;
	
	@GetMapping("bill")
	public ResponseEntity<Bill> getBill(@RequestParam(value="sort",defaultValue = "asc") String sortOrder)
	{
		log.info("CUSTOM LOG INFO ResponseEntity Get Bill called with sortOrder + " + sortOrder);
		return (new ResponseEntity<Bill>(billService.getBillServ(),HttpStatus.OK));
	}
	
	@GetMapping("bill/error")
	public void getBillError(@RequestParam(value="sort",defaultValue = "asc") String sortOrder)
	{
		log.info("CUSTOM LOG INFO Before throwing the error + " + sortOrder);
		double res = 22/0;
	}
	
	@GetMapping("bill/{billId}")
	public ResponseEntity<Bill> getBillId(@PathVariable int billId)
	{
		log.info("CUSTOM LOG INFO ResponseEntity get Bill with BILL ID + " + billId);
		return (new ResponseEntity<Bill>(billService.getBillServ(),HttpStatus.OK));
	}
	
	
	@PostMapping("bill")
	public ResponseEntity<String> postBill()
	{
		log.debug("CUSTOM LOG DEBUG RE post bill is called");
		return (new ResponseEntity<String>(billService.postBillServ(),HttpStatus.CREATED));
		
	}
	
	@PutMapping("bill")
	public ResponseEntity<String> putBill()
	{
		log.warn("CUSTOM LOG WARN RE Put Bill called");
		return (new ResponseEntity<String>(billService.putBillServ(),HttpStatus.ACCEPTED));
	}
	
	@DeleteMapping("bill")
	public ResponseEntity<String> deleteBill()
	{
		log.error("CUSTOM LOG ERROR RE Delete Bill called");
		return (new ResponseEntity<String>(billService.delBillServ(),HttpStatus.ACCEPTED));
	}
	
}
