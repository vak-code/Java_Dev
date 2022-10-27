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

import com.example.demo.model.Customer;
import com.example.demo.service.CustService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RequestMapping("resp")
@RestController
public class CustControllerRespEntity {

	@Autowired
	CustService customerService;
	
	@GetMapping("cust")
	public ResponseEntity<Customer> getCustomer(@RequestParam(value="sort", defaultValue = "asc") String sortOrder)
	{
		log.info("CUSTOM LOG RS Get customer called with Query param = " + sortOrder);
		return (new ResponseEntity<Customer>(customerService.getCustService(),HttpStatus.OK));
	}
	
	@GetMapping("cust/{id}")
	public ResponseEntity<Customer> getCustomerWithPath(@PathVariable String id)
	{
		log.info("CUSTOM LOG RS Get customer called with PATH param = " + id);
		return (new ResponseEntity<Customer>(customerService.getCustService(),HttpStatus.OK));
	}
	
	@GetMapping("cust/error")
	public void getCustomerError()
	{
		log.info("CUSTOM LOG RS Get customer called with ERROR");
		int[] i = {1,2,3};
		int j = i[5];
	}
	
	@PostMapping("cust")
	public ResponseEntity<String> postCustomer()
	{
		log.debug("CUSTOM LOG RS PosT Customer called");
		return (new ResponseEntity<String>(customerService.postCustService(),HttpStatus.CREATED));
	}
	
	@PutMapping("cust")
	public ResponseEntity<String> putCustomer()
	{
		log.debug("CUSTOM LOG RS PUT Customer called");
		return (new ResponseEntity<String>(customerService.putCustService(),HttpStatus.ACCEPTED));
	}
	
	@DeleteMapping("cust")
	public ResponseEntity<String> deleteCustomer()
	{
		log.debug("CUSTOM LOG RS DELETE Customer called");
		return (new ResponseEntity<String>(customerService.delCustService(),HttpStatus.ACCEPTED));
	}
}
