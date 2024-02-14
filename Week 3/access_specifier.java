import tools.A;
public class access_specifier {
    public static void main(String[] args) {
        A a=new A();
        a.Hi(); 

        a.c(); //private method cannot be accessible outside class
        // Accessing the private method using object of same class is not allowed in java

        a.showMe();
        //protected method cannot accessible outside  package but can be accessed by sub-class or other classes present in the same package
    }
}
