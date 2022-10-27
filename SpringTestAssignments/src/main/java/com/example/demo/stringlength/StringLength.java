package com.example.demo.stringlength;

import org.springframework.stereotype.Service;

@Service
public class StringLength {

	public int stringLength(String inputStr)
	{
		return inputStr.length();
	}
}
