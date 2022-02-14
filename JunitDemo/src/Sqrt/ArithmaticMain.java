package Sqrt;

import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

public class ArithmaticMain 
{
@Test
public void sqrtTest()
{
	Arithmatic a= new Arithmatic();
	double expResult=2.5;
	double result=a.findsqurt(6.25);
	Assert.assertEquals(expResult, result,0.0);
	
}
}
