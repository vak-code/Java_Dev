/**
 * 
 */
package com.vishal.assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author vak
 *
 */
public class JUnitTestExampleTest {

	private JUnitTestExample junitTestObject;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		junitTestObject = new JUnitTestExample();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		junitTestObject = null;
	}

	/**
	 * Test method for {@link com.vishal.assignments.JUnitTestExample#lengthOf(java.lang.String)}.
	 */
	@Test
	public void testLengthOf() {
		assertEquals(8, junitTestObject.lengthOf("Shubhangi"));
	}

}
