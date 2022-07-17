package com.vishal.core;

//This class demonstrates the Boolean data type
public class BoolDemo {
	
	public static void main(String[] args)
	{
		boolean b;
		
		b=false;
		System.out.println("b is : "+b);
		
		b=true;
		System.out.println("b is : "+b);
		
		//Boolean value controls the IF statement
		if(b)
			System.out.println("This will be executed");
		
		b=false;
		
		if(b)
			System.out.println("This will not be executed");
		
		//The output of relational operator is boolean
		System.out.println("The value of 10 > 9 : "+(10>9));
	}

}
