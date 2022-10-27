package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.service.OrderType;

@Component
@Qualifier("intl")
public class InternationalOrder implements OrderType {

	@Override
	public String getOrder() {
		return "INTERNATIONAL";
	}

}
