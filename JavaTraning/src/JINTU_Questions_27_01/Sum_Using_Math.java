package JINTU_Questions_27_01;

public class Sum_Using_Math {

	public static void main(String[] args) 
	{
		
         { 
        	double n=Double.parseDouble(args[0]);
                 double sum=0.0;
                 for(int i=0;i<=n;i++)
                   sum=sum+(1.0/Math.pow(2,i));
                System.out.println("Sum is "+sum);
         }

	}

}
