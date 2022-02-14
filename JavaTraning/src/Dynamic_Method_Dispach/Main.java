package Dynamic_Method_Dispach;

public class Main {

	public static void main(String[] args) {
		ClassA a=new ClassA();
        ClassB b=new ClassB();
        ClassC c=new ClassC();
        ClassA r;     // obtains a reference of type A
        r=a; r.callme();
        r=b; r.callme();
        r=c; r.callme();
       
	}

}
