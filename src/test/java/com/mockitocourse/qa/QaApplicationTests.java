package com.mockitocourse.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QaApplicationTests {

	Calculator calculator = new Calculator();
	
	@Test
	void isAddTwoNumber() {
		// given
		int number1 = 20;
		int number2 = 30;
		
		// when
		int result = calculator.add(number1, number2);
		
		// then
		assertEquals(50, result);
	}

	
	public class Calculator{
		public int add (int a, int b) {
			return a + b;
		}
	}
}
