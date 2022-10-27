package com.example.demo.oddnumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OddNumberService {

	@Autowired
	private OddNumberDP dataProvider;

	public boolean isOdd() {
		int num = dataProvider.readNum();

		if (num % 2 != 0)
			return true;
		else
			return false;
	}
}
