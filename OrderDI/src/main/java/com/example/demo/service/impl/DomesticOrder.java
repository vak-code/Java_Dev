package com.example.demo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.service.OrderType;

@Component
@Primary
public class DomesticOrder implements OrderType {

	@Override
	public String getOrder() {
		return "Domestic";
	}

}
