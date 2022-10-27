package com.example.demo.service;

import java.util.Date;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bill;
import com.example.demo.repository.BillRepository;

import antlr.collections.List;

@Service
public class BillService {

	@Value("${getMsg}")
	String getMsg;
	
	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	@Autowired
	BillRepository billRepository;
	

	
	public Bill getBillServ() {
		//return getMsg;
		return (new Bill(101L,120.50,"31-may-2022"));
	}

	public String postBillServ() {
		return postMsg;
	}

	public String putBillServ() {
		return env.getProperty("putMsg");
	}

	public String delBillServ() {
		return env.getProperty("delMsg");
	}

	
	//DB related methods
	
	@PostConstruct
	public void loadData()
	{
		billRepository.saveAll(java.util.List.of(
				new Bill(1L,100.0,"31-01-2022"),
				new Bill(2L,200.0,"31-05-2022"),
				new Bill(3L,100.0,"30-04-2022")
				));
	}
	
	public ResponseEntity<String> postBillDB(Bill bill) {
		billRepository.save(bill);
		return new ResponseEntity<String>("Bill Posted Successfully",HttpStatus.CREATED);
	}

	public ResponseEntity<Optional<Bill>> getBillDB(Long id) {
		return new ResponseEntity<Optional<Bill>>(billRepository.findById(id),HttpStatus.OK);
	}

	public Optional<java.util.List<Bill>> getAllBillsDB() {
		return Optional.ofNullable(billRepository.findAll());
	}

	public ResponseEntity<String> putBillDB(Bill bill) {
		if(billRepository.existsById(bill.getBillId()))
		{
			billRepository.save(bill);
			return new ResponseEntity<String>("Existing Bill Updated",HttpStatus.ACCEPTED);
		}
		else
		{
			billRepository.save(bill);
			return new ResponseEntity<String>("New Bill Created",HttpStatus.CREATED);
		}
		
	}

	public ResponseEntity<String> deleteBillDB(Long id) {
		billRepository.deleteById(id);
		return new ResponseEntity<String>(" Bill "+ id +" Deleted",HttpStatus.ACCEPTED);
	}
	
	

}
