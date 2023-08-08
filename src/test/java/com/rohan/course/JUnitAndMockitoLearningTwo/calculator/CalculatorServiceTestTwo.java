package com.rohan.course.JUnitAndMockitoLearningTwo.calculator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTestTwo {

	private MathApplication mathApplication;
	private CalculatorService calculator;

	@Before
	public void setup() {

		mathApplication = new MathApplication();
		CalculatorService calculatorService = new CalculatorServiceImpl();
		calculator = spy(calculatorService);

	}

	@Test
	public void addTest() {

		assertEquals(calculator.add(4, 5), 9.00, 0.0);

	}

}
