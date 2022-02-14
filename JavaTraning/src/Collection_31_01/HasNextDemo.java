package Collection_31_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HasNextDemo 
{
	public static void main(String s[])
	{
		List<String> namelist=new LinkedList<String>();
		String[] name= {"palli","pju","rucha","gaytri"};
		for(int k=0;k<name.length;k++)
		{
			namelist.add(name[k]);
		}
		for(int k=0;k<namelist.size(); k++)
		{
			System.out.println(namelist.get(k));
		}
	}
}
