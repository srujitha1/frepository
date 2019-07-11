package com.pack.TestingDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {
	static Calculator c1;
	@Test
	public void testAdd()
	{
		//fail("Not yet implemented");
		assertEquals("failed",40,c1.add(20,20));
	}
	@Test
	public void testSub()
	{
			//fail("Not yet implemented");
			assertEquals("failed",0,c1.sub(20,20));
			
	}	
	@BeforeClass
	public static void createObject()
	{
		c1=new Calculator();
	}
	@AfterClass
	public static void deleteObject()
	{
		c1=null;
	}
	@Test
	public void isEqual()
	{
		assertTrue("a and b are not equal",c1.compare(30, 20));
	}
	@Test
	public void isNotEqual()
	{
		assertFalse(c1.compare(30, 20));
	}

}
