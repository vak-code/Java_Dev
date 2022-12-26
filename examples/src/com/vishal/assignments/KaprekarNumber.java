package com.vishal.assignments;

public class KaprekarNumber {

	public static void main(String[] args) {
		
		int input = 4879, count1=0, count2=0, temp =0 , remainder =0 , tens=1;
		int lengthOfInput=0, lengthOfSquare=0;
		int square = input * input;
		int finalSquare = square;
		int orgInput = input;
		System.out.println(input + " square = " + square);
		
		while(input >= 10)
		{
			temp = input%10;
			input = input/10;
			System.out.println(input + " temp = " + temp);
			count1++;
		}
		count1++;
		
		lengthOfInput = count1;
		
		System.out.println("lengthOfInput = " + lengthOfInput);
		
		while(square >= 10 && count2<count1)
		{
			temp = square%10;
			square = square/10;
			System.out.println(square + " temp = " + temp);
			count2++;
			tens *= 10;
		}
		
		
		lengthOfSquare = count2;
		
		remainder = finalSquare - (square * tens); 
		
		System.out.println("lengthOfSquare = " + lengthOfSquare +" square = " + square + " remainder = "+ remainder);
		System.out.println("tens = " + tens);
		System.out.println("input = " + orgInput + " sum = " + (square + remainder));
		if(orgInput == (square + remainder))
			System.out.println("It is a Karwekar's number");
		else
			System.out.println("It is NOT a Karwekar's number");
	}
}
