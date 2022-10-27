package com.example.demo.reversestring;

import org.springframework.stereotype.Service;

@Service
public class ReverseString {

	public String reverseStr(String input)
	{
		char[] inputCharArray = input.toCharArray();
		String revCharArray="";
		
		for(int i = input.length() - 1 ; i >= 0 ; i--)
		{
			revCharArray += inputCharArray[i];
		}
		
		return revCharArray;
	}
}
