package String_25_01;

import java.io.IOException;

public class Read_Char_In_String {

	public static void main(String[] args) throws IOException 
	{
		   char c;
		   System.out.println("enter a character");
		   c=(char) System.in.read();
		   System.in.read();
		   System.out.println("you enter:"+c);
		
	}
}


