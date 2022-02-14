package OverrridenDemo;
//import OverrridenDemo.WhiteDemo.WithFinals;
//import OverrridenDemo.WhiteDemo.OverridingPrivate;



public class MainDEMO
{
	public static void main(String s[])
	{
	   OverridingPrivate2 op2 = new OverridingPrivate2();
      op2.f(); op2.g();  OverridingPrivate op = op2; WithFinals wf = op2;
 }

}
