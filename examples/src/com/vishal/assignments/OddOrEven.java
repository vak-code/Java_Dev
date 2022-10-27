package com.vishal.assignments;

public class OddOrEven {
	
	private boolean res;
	
	public boolean oddEven(int num)
	{
		if(num%2 == 0)
			res = true;
		else 
			res = false;
		
		System.out.println("Result = " + res);
		
		return res;
	}
	
	

}
