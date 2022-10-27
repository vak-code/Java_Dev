package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Currency;

@Service
public class CurrencyService {

	@Value("${getMsg}")
	String getMsg;
	
	@Value("${delMsg}")
	String delMsg;
	
	@Autowired
	Environment env;
	
	public Currency getCurrServ() {
		//return getMsg;
		return new Currency("USD",80.0);
	}

	public String postCurrServ() {
		return env.getProperty("postMsg");
	}

	public String putCurrServ() {
		return env.getProperty("putMsg");
	}

	public String delCurrServ() {
		return delMsg;
	}

}
