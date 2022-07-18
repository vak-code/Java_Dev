package com.vishal.core;

public class StaticErrorDemo {

	int denom = 3; //normal instance variable
	static int val = 100; //static variable
	
	static int valDenom()
	{
		return val / denom; //this n't work as can't access static variable from static method
	}
}
