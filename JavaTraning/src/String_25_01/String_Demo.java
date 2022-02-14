package String_25_01;

public class String_Demo {

	public static void main(String[] args) 
	{
                String s = new String("Have a nice Day");
 
       System.out.println("String Length = " + s.length() );
 
       System.out.println("Modified String = " + s.replace('n', 'N'));

       System.out.println("Converted to Uppercase = " + s.toUpperCase());

       System.out.println("Converted to Lowercase = " + s.toLowerCase());
 
        }
}