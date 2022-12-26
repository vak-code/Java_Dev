package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping("/get")
	public ResponseEntity<Account> getAccount()
	{
		log.info("Inside getAccount");
		return new ResponseEntity<Account>(accountService.getAccountService(),HttpStatus.resolve(401));
	}
}
