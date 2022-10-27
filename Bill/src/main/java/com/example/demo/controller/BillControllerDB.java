package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bill;
import com.example.demo.service.BillService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
@RequestMapping(value="/object")
public class BillControllerDB {

	@Autowired
	BillService billService;
	
	@PostMapping("bill")
	public ResponseEntity<String> postBill(@RequestBody Bill bill)
	{
		log.debug("CUSTOM LOG Bill Posting DB called");
		return (billService.postBillDB(bill));
	}
	
	@GetMapping("bill/{id}")
	public ResponseEntity<Optional<Bill>> getBill(@PathVariable Long id)
	{
		log.debug("Custom Log Get Bill Id");
		return (billService.getBillDB(id));
	}
	
	@GetMapping("bill")
	public Optional<List<Bill>> getBills()
	{
		log.debug("Custom debug get all bills");
		return billService.getAllBillsDB();
	}
	
	@PutMapping("bill")
	public ResponseEntity<String> putBill(@RequestBody Bill bill)
	{
		return billService.putBillDB(bill);
	}
	
	@DeleteMapping("bill/{id}")
	public ResponseEntity<String> deleteBillDB(@PathVariable Long id)
	{
		return billService.deleteBillDB(id);
	}
}
