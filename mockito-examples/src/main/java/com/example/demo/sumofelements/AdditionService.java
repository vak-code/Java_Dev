package com.example.demo.sumofelements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionService {
	@Autowired
	private DataProvider dataProvider;
	

	public int sumOfAllNosFromArray() {
		int [] numbers = dataProvider.getElements();
		
		int sum = 0;
		
		for(int number:numbers) {
			sum += number;
		}
		
		return sum;
		
	}

}
