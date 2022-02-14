import org.junit.Assert;
import org.junit.Test;

public class MainGretest {

	
//		Greatest g= new Greatest();
//		int res=g.greatest(50, 60, 0);
//		System.out.println(res);
	
		@Test
	    public void greatest()
	    {
	        int x=30;
	        int y=20;
	        int z=50;
	        int Actualresult=50;
	        Greatest g= new Greatest();
	        int finalResult=g.greatest(x,y,z);
	        Assert.assertEquals(Actualresult, finalResult);

	}

}
