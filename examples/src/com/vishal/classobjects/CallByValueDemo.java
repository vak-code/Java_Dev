package com.vishal.classobjects;


class Test
{
	
	
	void noChange(int i, int j)
	{
		i = i + j;
		j = -j;
		
	}
}

public class CallByValueDemo {

	public static void main(String[] args)
	{
		Test nt = new Test();
		
		int a = 10, b = 20;
		
		System.out.println("Before change call : a = " + a + " b = " + b);
		
		nt.noChange(a, b);
		
		System.out.println("After change call : a = " + a + " b = " + b);
		
	}
}
