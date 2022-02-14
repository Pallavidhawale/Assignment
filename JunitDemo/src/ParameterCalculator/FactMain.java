package ParameterCalculator;

import org.junit.Test;

import junit.framework.Assert;

public class FactMain 
{
@Test
public void factTest()
{
	int n=5;
	int res=120;
	Factorial f= new Factorial();
	int actual=f.fact(n);
	Assert.assertEquals(res, actual);
	
}
}
