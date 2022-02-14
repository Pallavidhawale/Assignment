package Basic;

import java.io.FileReader;
public class No_Of_Word_Line_Seq 
{
	 
		public static void main(String []a) throws Exception
	    {   
			FileReader f = new FileReader("demo.txt");
             int l,w,ch;
             l=w=ch=0;
             int c;
        while((c=f.read())!=-1)
        {    if(c==' ')
                w++;
            else if(c=='\n')
            {    l++; w++;
            }
            else
                ch++;
        }
System.out.println("Lines: "+l+" Words:"+w+"  Characters:"+ch);
    }
}
