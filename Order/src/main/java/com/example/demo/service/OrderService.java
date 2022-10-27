package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;

@Service
public class OrderService {

	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	public Order getServ() {
		return (new Order(123456, "Shipped"));
	}
	
	public String postServ() {
		return postMsg;
	}

	public String putServ() {
		return env.getProperty("putMsg");
	}

	public String delSrv() {
		return env.getProperty("delMsg");
	}

	public String getOrder(int id) {
		// TODO Auto-generated method stub
		return "Order id = " + id + " provided";
	}

}
