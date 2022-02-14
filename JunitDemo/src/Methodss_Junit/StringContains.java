package Methodss_Junit;

import org.junit.Test;

	import static org.hamcrest.MatcherAssert.assertThat;
	import static org.hamcrest.core.StringContains.containsString;
	import static org.hamcrest.core.StringEndsWith.endsWith;

	public class StringContains {
	    @Test
	    public void testcontainsString(){
	        assertThat("tbarua1@gmail.com",containsString("@gmail.com"));
	    }
	    @Test
	    public void testendsWith(){
	        assertThat("tbarua1@gmail.com",endsWith("com"));
	    }
	
}
