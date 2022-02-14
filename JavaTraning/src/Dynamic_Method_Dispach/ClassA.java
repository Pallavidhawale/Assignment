package Dynamic_Method_Dispach;

public class ClassA 
{    void callme()
        {    System.out.println("Inside A's callme Method");
        }
    }
    class B extends ClassA
    {    void callme()    //override callme()
        {    System.out.println("Inside B's callme Method");
        }
    }
    class C extends ClassA
    {    void callme()    // override callme()
        {    System.out.println("Inside C's callme Method");
        }
    }
    class dmd
    {    public static void main(String args [ ])
        {    ClassA a=new ClassA();
            B b=new B();
            C c=new C();
            ClassA r;     // obtains a reference of type A
            r=a; r.callme();
            r=b; r.callme();
            r=c; r.callme();
           
        
        }
    
}
