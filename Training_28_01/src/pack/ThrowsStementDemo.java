package pack;

public class ThrowsStementDemo
{
	    public static void main(String args[])
         {
    	   try
            {   
    		    ThrowsStatement td = new ThrowsStatement();
            }
            catch(NullPointerException e)
            { 
            	System.out.println("recaught");
            }
        
              
    }
}
