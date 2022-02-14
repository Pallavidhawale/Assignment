package Functional_programming;

import java.io.FileWriter;

public class FileWrite
{
	public static void Main(String s[])
	{
		try
		{
			FileWriter fileWriter=new FileWriter("C:\\Users\\pallavi.dhawale\\eclipse-workspace\\Training_28_01\\src\\my.txt");

			fileWriter.write("This is the text");

			fileWriter.close();

		}
	catch (Exception e) 
		{
		 e.printStackTrace();
	}
			
		
	}
}


