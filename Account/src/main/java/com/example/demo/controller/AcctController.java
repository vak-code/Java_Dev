package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class AcctController {
	@Autowired
	AccountService accountService;
	
	@GetMapping("acct")
	public ResponseEntity<Account> getAcct(@RequestParam(value="type",defaultValue = "SBA") String type)
	{
		log.info("CUSTOM log INFO get account");
		//return accountService.getAcct();
		return (new ResponseEntity<Account>(accountService.getAcct(type),HttpStatus.OK));
	}
	
	@GetMapping("/error")
	public void getAcct() throws Exception
	{
		throw new Exception();
		//log.info("CUSTOM log INFO get account");
		//return accountService.getAcct();
		//return (new ResponseEntity<Account>(accountService.getAcct(type),HttpStatus.OK));
	}
	
	@GetMapping("acct/{id}")
	public Optional<Account> getAcct(@PathVariable Long id,@RequestParam(value="type",defaultValue="SBA") String type)
	{
		log.info("CUSTOM log INFO get account");
		//return accountService.getAcct();
		return accountService.getAccount(id);
	}
	
//	@GetMapping("acct")
//	public Account getAcct()
//	{
//		log.info("CUSTOM log INFO get account");
//		return accountService.getAcct();
//	}
	
	@PostMapping("acct")
	public ResponseEntity<String> postAcct()
	{
		log.debug("CUSTOM log DEBUG account created");
		//return accountService.postAcct();
		return (new ResponseEntity<String>(accountService.postAcct(),HttpStatus.CREATED));
	}

	@PutMapping("acct")
	public String putAcct()
	{
		log.warn("CUSTOM log WARN Put account done");
		return accountService.putAcct();
	}
	
	@DeleteMapping("acct")
	public String delAcct()
	{
		log.error("CUSTOM log ERROR Delete account");
		return accountService.delAcct();
	}
	
	@GetMapping("/accounts")
	public List<Account> getAllAccounts(){
		return accountService.getAccounts();
	}
	
	@DeleteMapping("/accounts/{id}")
	public void deleteAccount(@PathVariable Long id) {
		 accountService.deleteAccount(id);
	}
	
	@PostMapping("/accounts")
	public Account createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	@PutMapping("/accounts/{id}")
	public ResponseEntity<Account> updateAccount (@PathVariable Long id, @RequestBody Account account){
		return accountService.updateAccount(id, account); 
	}
}
