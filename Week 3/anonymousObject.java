class A{
    public A(){
    System.out.println("Object Created");
        }
    public void show()
    {
        System.out.println("in A show");
    }
}
public class anonymousObject {
    public static void main(String[] args) {
        new A().show();      //anonymous Object
        // new A().show();         //every time new A() object created
    }
}
