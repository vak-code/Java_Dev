package com.vishal.assignments;

//This program calculates the square of any number
public class CalculateSquare {
	
	static Integer calcSquare(Integer num)
	{
		if(num == null) {
			throw  new NullPointerException();
		}
		return num*num;
	}
	
	public static void main(String[] args) {
		
		Integer inputNum = 30, square;
		
		square = calcSquare(inputNum);
			
			System.out.println("The square of " + inputNum +" is : " + square);
		
	}

}
