package com.vishal.assignments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionOf2TestMore {

	AdditionOf2 addObject;
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Not sure what can be done before class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Again static after class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Object can be created Before");
		addObject = new AdditionOf2();
	}
	
	@After
	public void after()
	{
		System.out.println("Object can be nullified after");
		addObject = null;
	}
	
	@Test
	public void testSum() {
		assertEquals(5, addObject.sum(2, 3));
	}
	
	@Test(expected=Exception.class)
	public void testNull()
	{
		int first=5;
		assertEquals(11, addObject.sum(first, 5));
	}
	

}
