// class Computer{
//     public void show(){
//         System.out.println("In Computer");
//     }
// }
// class Laptop extends Computer{
//     public void show(){
//         System.out.println("In Laptop");
//     }
// }
class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C show");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
        // Computer obj1=new Laptop();
        // obj1.show();
    }
}