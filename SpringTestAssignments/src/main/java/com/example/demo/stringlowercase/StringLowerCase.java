package com.example.demo.stringlowercase;

import org.springframework.stereotype.Service;

@Service
public class StringLowerCase {

	public String toLowerCase(String input)
	{
		return input.toLowerCase();
	}
}
