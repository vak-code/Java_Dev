package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.service.UserType;

@Primary
@Component
public class NormalUser implements UserType {

	@Override
	public String getUser() {
		return "NORMAL USER";
	}

}
