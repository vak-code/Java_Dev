package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OddOrEvenTest {
	
	OddOrEven oeObj;

	@Before
	public void before()
	{
		 oeObj = new OddOrEven();
		 System.out.println("Object created");
	}

	@After
	public void after()
	{
		System.out.println("Object nullified");
		oeObj = null;
	}
	
	@Test
	public void testOddEven() {
		//fail("Not yet implemented");
		boolean res = oeObj.oddEven(16);
		assertEquals(false, res);
	}

}
