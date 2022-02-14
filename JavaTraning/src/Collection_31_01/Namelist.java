package Collection_31_01;

import java.util.*; 
public class Namelist
{
public static void main(String [ ] args) 
{ 
	List<String> nameList = new LinkedList<String> (); 
	String [] names = {"Ann", "Bob", "Carol"};
	// Add to arrayList for 
	for(int k = 0; k < names.length; k++) 
		nameList.add(names[k]); 
	// Display name list 
	for (int k = 0; k < nameList.size(); k++)
		System.out.println(nameList.get(k)); 
	} 
}
