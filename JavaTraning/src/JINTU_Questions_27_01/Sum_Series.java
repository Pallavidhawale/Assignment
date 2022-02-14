package JINTU_Questions_27_01;

public class Sum_Series {

	public static void main(String[] args)
	{
         {       double n=Double.parseDouble(args[0]);
                 double sum=0.0;
                 for(int i=1;i<=n;i++)
                        sum=sum+(1.0/i);
                 System.out.println("Sum is "+sum);
         }
	}

}
