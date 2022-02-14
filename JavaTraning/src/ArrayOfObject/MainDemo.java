package ArrayOfObject;

public class MainDemo {

	public static void main(String[] args) 
	{
		ClassA a[]=new ClassA[5];
        for(int i=0;i<5;i++)
        {    a[i]=new ClassA();
            a[i].readdata();
            a[i].printdata();
        }
    }

	

}
