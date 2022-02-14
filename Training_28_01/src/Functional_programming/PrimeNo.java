package Functional_programming;

import java.util.stream.IntStream;

public class PrimeNo {


		public static boolean isPrime(int n) 
		{
		    return IntStream.range(1, n + 1)
		        .filter(x -> n % x == 0)
		        .count() == 2;
		 
		}

	

}
