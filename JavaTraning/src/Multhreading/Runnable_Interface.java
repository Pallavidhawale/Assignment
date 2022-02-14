package Multhreading;

public class Runnable_Interface implements Runnable
{
	  int x;  String name;
      public void threadname(String n)
      {   
          name=n;
       }
     public void run()
       {   
            for(x=0;x<10;x++)
            {   
                System.out.println(name);
            }
}
}
