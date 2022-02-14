package Functional_programming;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMax
{
	public static void main(String s[])
	{
		OptionalInt largest=IntStream.of(55,20,19,31,40,-2,62,30)
				.filter(n -> n%10==0)
				.max();
		System.out.println(largest.getAsInt());
	}
}