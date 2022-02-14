package Java_Traininng_25_01;

public class Min_Max_Array {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max is:"+max);
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min)
				
				min=a[i];
		}
		System.out.println("min is:"+min);

	}

}
