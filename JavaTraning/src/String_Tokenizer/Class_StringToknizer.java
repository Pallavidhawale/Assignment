package String_Tokenizer;

import java.util.StringTokenizer;

public class Class_StringToknizer {

	public static void main(String[] args) 
	{
		String s=new String("27/9/1990:4-4-727:a");
        StringTokenizer st=new StringTokenizer(s,"/:");
        System.out.println("TotalTokens:"+st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println("  "+st.nextToken());
        }
    }

	

}
