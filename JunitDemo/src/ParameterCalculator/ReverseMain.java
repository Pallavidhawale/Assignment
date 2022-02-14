package ParameterCalculator;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseMain 
{
@Test
public void reverseTest()
{
	int number=123;
	int reverse=321;
	ReverseNo rn= new ReverseNo();
	int actual=rn.reverseNumber(number);
	Assert.assertEquals(reverse, actual);
}
}
