import tools.A;

class A{
    public A()
    {
        System.out.println("in A");
    }
    public A(int n)
    {
        System.out.println("in int A");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        super(5);
        // this();
        System.out.println("in int B");
    }
}
public class Super {
    public static void main(String[] args) {
        B obj=new B(5);
    }
}
//super means call the constructor of super class
//every class in java extends class Object even if you dont mention