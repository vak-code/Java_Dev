package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Value("${getMsg}")
	String getMsg;
	
	@Autowired
	Environment env;
	
	@Autowired
	AccountRepository accountRepository;
	
	@PostConstruct
	private void loadData() {
		
		accountRepository.saveAll(List.of(
				new Account(11L, "saving"),
				new Account(12L, "current"),
				new Account(13L, "loan"),
				new Account(14L, "insurance"),
				new Account(15L, "credit")
				
				));
	}
	
	@PreDestroy
	public void beforeBeanDestroy()
	{
		System.out.println("Bean is getting destroyed");
	}
	
	public Account getAcct() {
		//return getMsg;
		return new Account(100L,"SBA");
	}

	public String postAcct() {
		return env.getProperty("postMsg");
	}

	public String putAcct() {
		
		return env.getProperty("putMsg");
	}

	public String delAcct() {
		
		return env.getProperty("delMsg");
	}



	public Account getAcct(String type) {
		// TODO Auto-generated method stub
		return new Account(100L,type);
	}

	public Account getAcct(Long id, String type) {
		// TODO Auto-generated method stub
		return new Account(id,type);
	}


	public List<Account> getAccounts() {
		List<Account> allAccounts = accountRepository.findAll();
		
		for(Account account: allAccounts) {
			
		}
		
		return allAccounts;
	}

	
	public Optional<Account> getAccount(Long id) {
		// TODO Auto-generated method stub
		return accountRepository.findById(id);
	}

	public void deleteAccount(Long id) {
		 accountRepository.deleteById(id);
	}


	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}


	public ResponseEntity<Account> updateAccount(Long id, Account account) {
		return (accountRepository.existsById(id)?
				new ResponseEntity<> (accountRepository.save(account), HttpStatus.OK):
					new ResponseEntity<> (accountRepository.save(account), HttpStatus.CREATED));
	}
	
}
