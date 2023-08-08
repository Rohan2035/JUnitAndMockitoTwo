package com.rohan.course.JUnitAndMockitoLearningTwo.calculator;

public class MathApplication {

	private CalculatorService calculatorService;

	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public double add(int x, int y) {
		
		return calculatorService.add(x, y);
		
	}
	
	public double subtract(int x, int y) {
		
		return calculatorService.subtract(x, y);
		
	}
	
	public double multiply(int x, int y) {
		
		return calculatorService.multiply(x, y);
		
	}
	
	public double divide(int x, int y) {
		
		return calculatorService.divide(x, y);
		
	}

}
