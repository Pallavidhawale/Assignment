package String_Tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NoOfWord_Given_Text {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a string");
        str = s.nextLine();
        StringTokenizer stzer = new StringTokenizer(str);
        System.out.println("Total words:"+stzer.countTokens());
    }
	

}
