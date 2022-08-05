package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumOfArrayTest {

	 static SumOfArray sumArray;
	
	@BeforeClass
	public static void beforeClass()
	{
		sumArray = new SumOfArray();
		System.out.println("In Before Class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		sumArray = null;
		System.out.println("In After Class");
	}
	
	@Test
	public void testArraySum() {
		//fail("Not yet implemented");
		int[] nums = {1, 2, 3, 4, 15};
		int sum = sumArray.arraySum(nums);
		assertEquals(25, sum);
		
	}
	
	@Test
	public void testArraySumNegs() {
		//fail("Not yet implemented");
		int[] nums = {-1, -2, -3, -4, 0};
		int sum = sumArray.arraySum(nums);
		assertEquals(-10, sum);
		
	}
	
	@Test
	public void testArraySumMix() {
		//fail("Not yet implemented");
		int[] nums = {1, 2, -3, 4, -15};
		int sum = sumArray.arraySum(nums);
		assertEquals(-11, sum);
		
	}

}
