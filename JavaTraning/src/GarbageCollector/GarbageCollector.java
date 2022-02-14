package GarbageCollector;

public class GarbageCollector 
{

	public static void main(String[] args) 
	{
		int SIZE = 200;
        StringBuffer s;
        for (int i = 0; i < SIZE; i++){    }
        System.out.println("Garbage Collection started explicitly.");
        long time = System.currentTimeMillis();
        System.gc();
    System.out.println("It took " + (System.currentTimeMillis()-time) + " ms");
    System.out.println("this is also garbage collectoir also used in garbage coolector");
    System.out.println("system.in()");
	}

}
