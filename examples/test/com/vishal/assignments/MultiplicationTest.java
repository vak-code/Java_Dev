package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultiplicationTest {

	static Multiplication multiplyObj;
	int num1, num2, result;

	@BeforeClass
	public static void beforeClass() {
		multiplyObj = new Multiplication();
		System.out.println("Object initialized");
	}

	@Before
	public void before()
	{	
		System.out.println("Inputs initialized");
	}
	
	@After
	public void after()
	{
		num1 = 0;
		num2 = 0;
		result = 0;
		System.out.println("inputs reset");
	}
	
	@AfterClass
	public static void afterClass()
	{
		multiplyObj = null;
		System.out.println("Object nullified");
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		num1 = 10;
		num2 = 20;
		result = multiplyObj.multiply(num1, num2);
		assertEquals(30, result);
		
	}
	
	@Test
	public void testMultiplyNegs() {
		//fail("Not yet implemented");
		num1 = -1;
		num2 = 0;
		result = multiplyObj.multiply(num1, num2);
		assertEquals(0, result);
		
	}

}
