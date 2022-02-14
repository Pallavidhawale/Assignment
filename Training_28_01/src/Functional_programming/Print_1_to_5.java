package Functional_programming;

import java.util.stream.IntStream;

public class Print_1_to_5 {

	public static void main(String[] args)
	{
		
		int sum = IntStream.range(1, 6)
		    .map(n -> n * n)
		    .sum();
		System.out.println(sum);
	}

}
