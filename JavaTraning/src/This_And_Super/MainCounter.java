package This_And_Super;

public class MainCounter extends Counter
{
   public static void main(String[ ] args)
   {
     Counter x = new Counter();
	x.increment().increment().increment().print();
   }

}
