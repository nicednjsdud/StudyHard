package org.edwith.webbe.calculatorcli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		CalculatorService calculatorService = ac.getBean(CalculatorService.class);
		
		System.out.println(calculatorService.plus(10, 50));
	}
}
