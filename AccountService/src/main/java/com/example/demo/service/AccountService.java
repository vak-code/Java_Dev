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
	
	public Account addAccountService(Account account) {
		accountRepository.save(account);
		return account;
	}

	public Optional<Account> addAccountService(int id) {
		return accountRepository.findById(id);
	}

}
