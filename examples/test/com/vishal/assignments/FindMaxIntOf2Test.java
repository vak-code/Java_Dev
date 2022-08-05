package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindMaxIntOf2Test {

	FindMaxIntOf2 maxObj;
	
	@Before
	public void before()
	{
		maxObj = new FindMaxIntOf2();
		System.out.println("In BEFORE..object instance created");
	}
	
	@After
	public void after()
	{
		maxObj = null;
		System.out.println("In AFTER...object nullified");
	}
	
	@Test
	public void testFindMax() {
		//fail("Not yet implemented");
		int max = maxObj.findMax(1000, 5000);
		assertEquals(50000, max);
	}
	
	@Test
	public void testFindMaxWithNegative()
	{
		int max = maxObj.findMax(-10, 0);
		assertEquals(0, max);
	}

}
