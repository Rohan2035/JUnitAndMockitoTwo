package com.rohan.course.JUnitAndMockitoLearningTwo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.rohan.course.JUnitAndMockitoLearningTwo.calculator.CalculatorServiceTest;
import com.rohan.course.JUnitAndMockitoLearningTwo.calculator.CalculatorServiceTestTwo;

public class TestRunner {
	
	public static void main(String[] args) {
		
//		Result result = JUnitCore.runClasses(StockServiceTest.class);
		
		Result result = JUnitCore.runClasses(CalculatorServiceTest.class);
		
//		Result result = JUnitCore.runClasses(CalculatorServiceTestTwo.class);
		
		for(Failure failure : result.getFailures()) {
			
			System.out.println(failure.getMessage());
			
		}
		
		System.out.println(result.wasSuccessful());
		
	}

}
