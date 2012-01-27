package com.pec.demo;

import com.pec.demo.calculator.Calculator;
import com.pec.demo.calculator.impl.CalculatorImpl;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculator calc = new CalculatorImpl();
		
		// let us add 2 numbers..
		int first = 10;
		int second = 5;
		int result = calc.add(first,second);
		System.out.println("ADD result is " + result  + " for given inputs " + first + "," + second);
		
		

	}

}
