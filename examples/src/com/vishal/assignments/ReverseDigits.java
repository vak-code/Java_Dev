package com.vishal.assignments;

public class ReverseDigits {

	private int temp = 0;
	String reverse = "";
	
	public String getReverse(int num)
	{
		//num = num
		
		while(num >= 10)
		{
			temp = num % 10;
			num -= temp;
			num /= 10;
			
			reverse += temp;
			System.out.println(num + " |  " + temp + " | " + reverse);
		}

		reverse += num;
		
		System.out.println("Rev : " + reverse);
		return reverse;
	}
}
