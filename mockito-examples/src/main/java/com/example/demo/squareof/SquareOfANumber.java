package com.example.demo.squareof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SquareOfANumber {

	@Autowired
	private DataProvider dataProvider;
	
	public int findSquare()
	{
		int input = dataProvider.readNum();
		
		return input * input;
	}
}
