package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public Optional<Account> getAccountService(int id) {
		return (accountRepository.findById(id));
	}

	public Account addAccountService(Account account) {
		return (accountRepository.save(account));
	}

}
