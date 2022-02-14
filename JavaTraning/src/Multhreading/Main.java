package Multhreading;

public class Main {

	public static void main(String[] args) 
	{
	      Runnable_Interface tc1=new Runnable_Interface ();
	      Runnable_Interface tc2=new Runnable_Interface();
          Thread t1=new Thread(tc1);
          Thread t2=new Thread(tc2);
          t1.start();
           t2.start();
     }
}
