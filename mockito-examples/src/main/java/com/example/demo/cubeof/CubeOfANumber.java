package com.example.demo.cubeof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CubeOfANumber {

	@Autowired
	private DataProviderCube dataProvider;
	
	public int findCube()
	{
		int input = dataProvider.readNum();
		
		return input * input * input;
	}
}
