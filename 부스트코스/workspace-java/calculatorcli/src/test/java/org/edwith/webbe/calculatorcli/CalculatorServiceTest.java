package org.edwith.webbe.calculatorcli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ApplicationConfig.class})
public class CalculatorServiceTest {
	@Autowired
	CalculatorService calculatorService;
	
	@Test
	public void plus() throws Exception{
		// given
		int value1=10;
		int value2=5;
		
		// when
		int result=calculatorService.plus(value1, value2);
		
		// then
		org.junit.Assert.assertEquals(result, 15);
	}
	@Test
	public void divide() throws Exception{
		// given
		int value1=10;
		int value2=5;
		
		// when
		int result=calculatorService.divide(value1, value2);
		
		// then
		
		org.junit.Assert.assertEquals(result, 2);
		
	}
	@Test
	public void divideExceptionTest() throws Exception{
		// given
		int value1= 10;
		int value2= 0;
		// when
		try {
			calculatorService.divide(value1, value2);
		}catch(ArithmeticException e) {
			org.junit.Assert.assertTrue(true);
			return;
		}
		// then
		org.junit.Assert.assertTrue(false);
	}
}















