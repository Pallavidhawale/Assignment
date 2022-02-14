import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyTestCase {
	
	@Before
    public void setup(){
        int x=30;
       int  y=20;
       Calculator c=new Calculator();
    }
	
    @Test
    public void addtionTest()
    {
        int x=30;
        int y=20;
        int Actualresult=50;
        Calculator calculator = new Calculator();
        int finalResult=calculator.addition(x,y);
        Assert.assertEquals(Actualresult, finalResult);
    }
    @Test
    public void  subtractionTest(){
        int x=30;
        int y=20;
        int result=50;
        Calculator calculator = new Calculator();
        int finalResult=calculator.addition(x,y);
        Assert.assertEquals(result, finalResult);
    }
    @After
    public void cleaning(){
        int x=0;
      int  y=0;
        Calculator c= null;
    }
}
