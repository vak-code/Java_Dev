package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Account>> getAccount(@PathVariable int id)
	{
		
		return new ResponseEntity<Optional<Account>>(accountService.addAccountService(id),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Account> addAccount(@RequestBody Account account)
	{
		return new ResponseEntity<Account>(accountService.addAccountService(account),HttpStatus.CREATED);
	}
	
}
