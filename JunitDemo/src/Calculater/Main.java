package Calculater;

import org.junit.Assert;
import org.junit.Test;

public class Main
{
	@Test(timeout = 2)
	public void subtractionTest(){
	    int x=30;   // requirement collection
	    int y=20;
	    int result=600;
	    CalculatorDemo calculator = new CalculatorDemo();
	    int finalResult=calculator.multiply(x,y);
	    Assert.assertEquals(result, finalResult);
	}
	
}
