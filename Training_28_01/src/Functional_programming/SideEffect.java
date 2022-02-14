package Functional_programming;

public class SideEffect
{
	   
	public static int x;
	public static int f(int n)
	{
		x=x*2;
		return x+n;
	}
		public static void main (String s[])
		{
			x=5;
			int result=f(x)+f(x);
			System.out.println("Result:"+result);
		}
	}

