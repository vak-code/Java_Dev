package com.example.demo.zeronumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZeroNumberService {

	@Autowired
	private ZeroNumberDP dataProvider;
	
	public boolean isZero()
	{
		int num = dataProvider.readNum();
		
		if(num == 0)
			return true;
		else
			return false;
		
	}
	
}
