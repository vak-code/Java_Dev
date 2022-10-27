package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderType;

@RestController
public class OrderDIController {

	@Qualifier("intl")
	@Autowired
	OrderType orderType;
	
	@GetMapping
	public String getOrder()
	{
		return orderType.getOrder();
	}
}

