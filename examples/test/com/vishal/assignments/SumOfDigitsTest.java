package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumOfDigitsTest {
	
	static SumOfDigits sumObj;

	@BeforeClass
	public static void beforeClass()
	{
		sumObj = new SumOfDigits();
		System.out.println("Object initialized");
	}
	
	@AfterClass
	public static void afterClass()
	{
		sumObj = null;
		System.out.println("Object nullifid");
	}
	
	@Test
	public void testGetSum() {
		//fail("Not yet implemented");
		int sum = sumObj.getSum(1);
		assertEquals(1, sum);
	}

}
