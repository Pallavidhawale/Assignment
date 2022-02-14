package Multhreading;

public class Firstthread extends Thread
{
	      public void run()
	        {   
	          System.out.println ("Thread is running….");
	        }
	        public void start()
	        {   
	             run();
	         }
	         public static void main(String args[ ])
	        {         
	           Firstthread t=new Firstthread();
	            t.start();
	        
	    }
}
