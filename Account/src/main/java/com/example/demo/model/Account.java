package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Account {

	@Id
	private Long accountId;
	private String accountType;
	
	
	
	public Account() {
		super();
	}

	public Account(Long accountId, String accountType)
	{
		this.accountId = accountId;
		this.accountType = accountType;
	}
	
	public Long getAccountId()
	{
		return this.accountId;
	}
	
	public String getAccountType()
	{
		return this.accountType;
	}
}
