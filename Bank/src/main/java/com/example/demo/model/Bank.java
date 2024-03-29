package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	private Long bankId;
	private String bankName;
	
	public Bank() {}
	
	public Bank(Long bankId,String bankName)
	{
		this.bankId = bankId;
		this.bankName = bankName;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
}

