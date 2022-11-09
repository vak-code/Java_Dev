package com.vishal.lambda;

@FunctionalInterface
interface CalculatorInterface
{
	int operation(int num1, int num2);
	
	default void defMethod()
	{
		System.out.println("Default method");
	}
}

public class Calculator {

	public static void main(String[] args) {
		
		CalculatorInterface calcAdd = (a,b) -> (a + b);
		System.out.println("Sum = " + calcAdd.operation(10, 2));
		
		calcAdd = (int a, int b) -> (a - b);
		System.out.println("Substraction = " + calcAdd.operation(10, 2));
		
		CalculatorInterface calcMultiply = (a, b) -> {return (a * b);};
		System.out.println("Multiplication = " + calcMultiply.operation(10, 2));
		
		CalculatorInterface calcDiv = (int a, int b) -> (a / b);
		System.out.println("Division = " + calcDiv.operation(10, 2));
		
		CalculatorInterface calcMod = (a, b) -> (a % b);
		System.out.println("Modulus = " + calcMod.operation(10, 2));
	}
	
	
}
