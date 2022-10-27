package com.example.demo.stringuppercase;

import org.springframework.stereotype.Service;

@Service
public class StringUpperCase {

	public String toUpperCase(String input)
	{
		char[] inputString = input.toCharArray();
		System.out.println(inputString);
		return input.toUpperCase();
	}
}

