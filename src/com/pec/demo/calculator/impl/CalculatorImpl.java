package com.pec.demo.calculator.impl;

import com.pec.demo.calculator.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int first, int second) {
		int result =0;
		result =first +second;
		return result;
		
	}

	@Override
	public int substract(int first, int second) {
		
		return first + second;
	}

}
