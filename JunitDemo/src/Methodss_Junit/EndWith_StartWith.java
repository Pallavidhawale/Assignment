package Methodss_Junit;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class EndWith_StartWith {
    @Test
    public void testcontainsString(){  // litter slow
        assertThat("tbarua1@gmail.com",containsString("com"));
    }
    @Test
    public void testendsWith(){ // fastest approach
        assertThat("tbarua1@gmail.com",endsWith("com"));
    }
    @Test
    public void testbeginsWith(){ // fastest approach
        assertThat("tbarua1@gmail.com",startsWith("tbaru"));
    }
}