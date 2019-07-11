package com.pack.MockitoDemo;

public class Calculator {
	
	public int performCalculation(CalculatorService cs)
	{
		System.out.println("in class");
		return cs.add(1,2);
	}
}
