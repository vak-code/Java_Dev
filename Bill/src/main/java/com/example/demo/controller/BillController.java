package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bill;
import com.example.demo.service.BillService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class BillController {
	
	@Autowired
	BillService billServ;
	
	@GetMapping("bill")
	public Bill getBill()
	{
		log.info("CUSTOM GET bill");
		return billServ.getBillServ();
	}
	
	@PostMapping("bill")
	public String postBill()
	{
		log.debug("CUSTOM post bill");
		return billServ.postBillServ();
	}
	
	@PutMapping("bill")
	public String putBill()
	{
		log.warn("CUSTOM put bill");
		return billServ.putBillServ();
	}

	@DeleteMapping("bill")
	public String delBill()
	{
		log.error("CUSTOM delete bill");
		return billServ.delBillServ();
	}
	
}
