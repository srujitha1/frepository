package com.pack.MockitoDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculation {
	Calculator c1=null;
	CalculatorService cs=Mockito.mock(CalculatorService.class);
	@Test
	public void test()
	{
		assertEquals(3,c1.performCalculation(cs));
	}
	@Before
	public void createObject()
	
	{
		c1=new Calculator();
		//cs=new CalculatorService()
		/*{
			public int add(int a,int b)
			{
				return a+b;
			}
		};*/
	}
}


