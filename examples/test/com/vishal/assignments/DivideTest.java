package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivideTest {
	
	static Divide divObj;
	private double qoutient;
	
	@BeforeClass
	public static void beforeClass()
	{
		divObj = new Divide();
	}

	@AfterClass
	public static void afterClass()
	{
		divObj = null;
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		
		qoutient = divObj.divide(10, 20);
		assertEquals(0.5, qoutient, 0);
		//assertEquals(0.5, qoutient);
	}

}
