package com.example.demo.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.example.demo.model.Bank;
import com.example.demo.repository.BankRepository;

@Service
public class BankService {

	@Value("${getResp}")
	String getMsg;
	
	@Autowired
	Environment env;
	
	@Autowired
	BankRepository bankRepository;
		
	public Bank getBankSrvc() {
		//return getMsg;
		return (new Bank(01L,"SBI"));
	}

	public String postBankSrvc() {
		return env.getProperty("postResp");
	}

	public String putBankSrvc() {
		return env.getProperty("putResp");
	}

	public String delBankSrvc() {
		return env.getProperty("delResp");
	}

	public Bank createBank(Bank bank) {
		bankRepository.save(bank);
		return bank;
	}

	public Optional<Bank> getBankId(Long id) {
		return bankRepository.findById(id);
	
	}

	public ResponseEntity<String> putBankObjectService(Bank bank) {
		if (bankRepository.existsById(bank.getBankId()))
		{
			bankRepository.save(bank);
			return new ResponseEntity<String>("Existing Entity Updated",HttpStatus.ACCEPTED);
		}
		else
		{
			bankRepository.save(bank);
			return new ResponseEntity<String>("New Entity Created",HttpStatus.CREATED);			
		}
	}

	public ResponseEntity<String> deleteBankObjectService(Long id) {
		if (bankRepository.existsById(id))
		{
			bankRepository.deleteById(id);
			return new ResponseEntity<String>("Entity Deleted",HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<String>("Entity Not Found",HttpStatus.CREATED);			
		}
	}

	public ResponseEntity<java.util.List<Bank>> getAllBanks() {
		java.util.List<Bank> banks = bankRepository.findAll();
		return new ResponseEntity<java.util.List<Bank>>(banks,HttpStatus.OK);
	}

}
