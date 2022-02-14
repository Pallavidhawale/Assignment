package ArrayOfObject;

import java.util.Scanner;

public class ClassA
{
	int x,y;
	
    void readdata()
    {    Scanner s=new Scanner(System.in);
        
        x=s.nextInt();
        y=s.nextInt();
    }
    void printdata()
    {    System.out.println("x="+x+"\n"+"y="+y);
    
    }

}
