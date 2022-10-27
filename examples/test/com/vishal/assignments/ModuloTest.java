package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModuloTest {
	
	private static Modulo modObj;
	
	@BeforeClass
	public static void beforeClass()
	{
		modObj = new Modulo();
	}

	@Before
	public void before()
	{
		System.out.println("In BEFORE");
	}
	
	@AfterClass
	public static void afterClass()
	{
		modObj = null;
	}
	
	@After
	public void after()
	{
		System.out.println("in AFTER");
	}
	
	@Test
	public void testGetMod() {
		//fail("Not yet implemented");
		int res = modObj.getMod(23, 6);
		assertEquals(5, res);
	}

}
