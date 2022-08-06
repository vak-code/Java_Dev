package com.vishal.lambda;

interface CalculatorInterface
{
	int operation(int num1, int num2);
}

public class Calculator {

	public static void main(String[] args) {
		
		CalculatorInterface calcAdd = (a,b) -> (a + b);
		System.out.println("Sum = " + calcAdd.operation(10, 2));
		
		CalculatorInterface calcSubs = (int a, int b) -> (a - b);
		System.out.println("Substraction = " + calcSubs.operation(10, 2));
		
		CalculatorInterface calcMultiply = (a, b) -> {return (a * b);};
		System.out.println("Multiplication = " + calcMultiply.operation(10, 2));
		
		CalculatorInterface calcDiv = (int a, int b) -> (a / b);
		System.out.println("Division = " + calcDiv.operation(10, 2));
		
		CalculatorInterface calcMod = (a, b) -> (a % b);
		System.out.println("Modulus = " + calcMod.operation(10, 2));
	}
	
	
}
