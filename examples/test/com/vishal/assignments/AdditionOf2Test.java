package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionOf2Test {

	static AdditionOf2 sumObj;
	
	@BeforeClass
	public static void beforeClass()
	{
		sumObj = new AdditionOf2();
	}
	
	@AfterClass
	public static void afterClass()
	{
		sumObj = null;
	}
	
	@Test
	public void testSum() {
		//fail("Not yet implemented");
		
		int sum = sumObj.sum(-20, 40);
		
		assertEquals(20, sum);
	}

}
