package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseDigitsTest {

	static ReverseDigits revObj;
	
	@BeforeClass
	public static void beforeClass()
	{
		revObj = new ReverseDigits();
		System.out.println("Object initialized");
	}
	
	@AfterClass
	public static void afterClass()
	{
		revObj = null;
		System.out.println("Object nullified");
	}
	
	@Test
	public void testGetReverse() {
		//fail("Not yet implemented");
		
		String revNum = revObj.getReverse(12340);
		assertEquals("04321",revNum);
	}

}
