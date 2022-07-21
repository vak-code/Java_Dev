package com.vishal.classobjects;

//Parameterized constructor demo

class MyParamConsClass{
	
	int x;
	
	MyParamConsClass(int c){
		
		this.x  = c;
	}
}

public class ParamConsDemo {

	public static void main(String[] args)
	{
		MyParamConsClass m1 = new MyParamConsClass(10);
		MyParamConsClass m2 = new MyParamConsClass(20);
		
		System.out.println(m1.x + "  " + m2.x);
	}
}
