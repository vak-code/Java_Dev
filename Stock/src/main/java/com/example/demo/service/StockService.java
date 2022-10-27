package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class StockService {

	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	public Stock getStockServ() {
		return (new Stock("Apple",201.50));
	}

	public String postStockServ() {
		return postMsg;
	}

	public String putStockServ() {
		return env.getProperty("putMsg");
	}

	public String delStockServ() {
		return env.getProperty("delMsg");
	}

}
