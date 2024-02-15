class A{
    public void show1(){
        System.out.println("in A Show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B Show");
    }
}
public class typeCasting {
    public static void main(String[] args) {
        // double d=4.5;
        // int i=(int)d;
        // System.out.println(i);

        // A obj=new A();
        // obj.show1();  //A don't know B is present or not

        // B obj=new B();
        // obj.show1();    //but B knows that it is a subclass of A so it can call its method
        // obj.show2();

        A obj=new B();  // upcasting from B to A,B knows that it is a subclass of A so it will allow this kind
        obj.show1();

        B objB=(B) obj; //down casting
        objB.show2();
    }
}
