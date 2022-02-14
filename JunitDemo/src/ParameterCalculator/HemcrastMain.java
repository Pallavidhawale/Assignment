package ParameterCalculator;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;
public class HemcrastMain
{
@Test
public void testem()
{
	String gmail="pallaviDhawale@gmail.com";
	Assert.assertTrue(gmail.contains("@"));
}
@Test
public void testEmailId()
{
	String email="pranjal@gmail";
	Assert.assertThat(email, StringContains.containsString("gmail"));
}

}
