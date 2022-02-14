
public class RuntimeException {

	public class RunTimeExceptionDemo
	
{ public static void main(String[] args) 
		 
	   {
	        int x=10;
	        int y=0;
	        try 
	        {
	        int z=x/y;
	        System.out.println(z);
	        }
	        catch (ArithmeticException e)
	        {
	            // TODO: handle exception
	            System.out.println("One value is Zero "+e);
	        }

	    }
}
}