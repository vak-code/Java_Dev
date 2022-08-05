package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindMaxIntOutOf3Test {

	FindMaxIntOutOf3 maxObj;
	
	@Before
	public void before()
	{
		maxObj = new FindMaxIntOutOf3();
		System.out.println("Object initialized");
		
	}
	
	@After
	public void after()
	{
		maxObj = null;
		System.out.println("Object nullified");
	}

	@Test
	public void testFindMax() {
		//fail("Not yet implemented");
		
		int max = maxObj.findMax(1, 2, 3);
		assertEquals(3, max);
	}
	
	@Test
	public void testFindMaxNegs()
	{
		int max = maxObj.findMax(-1, -2, -3);
		assertEquals(-1, max);
	}
	
	@Test
	public void testFindMaxMix()
	{
		int max = maxObj.findMax(-2, 0, 2);
		assertEquals(2, max);
	}

}
