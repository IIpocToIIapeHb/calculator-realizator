package by.home.calculator.main;

import by.home.calculator.controller.Calculator;

public class Main {
	
	public static void main(String[] args) {
		
		String expression = "2*3+(5-1+(21-10))-6/3";
		Calculator calculator = new Calculator();
		double result = calculator.calculate(expression);
		System.out.println(result);
		
	}
}
