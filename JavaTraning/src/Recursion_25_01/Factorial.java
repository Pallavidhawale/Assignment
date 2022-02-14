package Recursion_25_01;

public class Factorial {

	public static void main(String[] args)
	{
		int fact=1;
		int i=1;
		int num=5;
		int res=Loopi(fact,i,num);
		System.out.println(res);
	}

	private static int Loopi(int fact, int i, int num) {
		if(i<=num)
		{
			fact=fact*i;
			return Loopi(fact, i+1, num);
		}
		
		return fact;
	}

}
