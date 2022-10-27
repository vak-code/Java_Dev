package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.service.UserType;

@Qualifier("admin")
@Component
public class AdminUser implements UserType {

	@Override
	public String getUser() {
		return "ADMIN USER";
	}

}
