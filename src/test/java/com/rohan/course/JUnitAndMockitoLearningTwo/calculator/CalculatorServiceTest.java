package com.rohan.course.JUnitAndMockitoLearningTwo.calculator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

	@InjectMocks
	private MathApplication mathApplication = new MathApplication();

	@Mock
	private CalculatorService calculatorService;

	/** verify in Mockito */
	@Test
	public void add() {
		
		when(calculatorService.add(10, 20)).thenReturn(30.00);
		
		assertEquals(mathApplication.add(10, 20), 30.00, 0.00);
		
		verify(calculatorService).add(10, 20);
		
	}

	/** Exceptions in Mockito */
	@Test(expected = ArithmeticException.class)
	public void divide() {
		
		when(calculatorService.divide(4, 0)).thenThrow(new ArithmeticException("Divide by Zero Exception !!"));
		
		double result = calculatorService.divide(4, 0);
		
		assertEquals(result, 0, 0.0);
		
	}

	/** Mockito Callbacks */
	@Test
	public void subtract() {
		
		when(calculatorService.subtract(5, 4)).thenAnswer((InvocationOnMock invocation) -> {
			
			Object[] args = invocation.getArguments();
			Object mock = invocation.getMock();
			
			return 1.00;
			
		});
		
		assertEquals(calculatorService.subtract(5, 4), 1.00, 0.0);
		
	}
	
	/** Behavior Driven Development */
	@Test
	public void multiply() {
		
		given(calculatorService.add(5, 5)).willReturn(10.00);
		
		assertEquals(calculatorService.add(5, 5), 10.00, 0.0);
		
	}

}
