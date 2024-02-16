// class A {
//     public void show() {
//         System.out.println("in A Show");
//     }
// }

// public class anonymousInnerClass {
//     public static void main(String[] args) {
//         A obj = new A() {
//             public void show() {
//                 System.out.println("in new Show"); //anonymous inner class
//             }
//         };
//         obj.show();
//     }
// }



//Abstract And Anonymous Inner Class
abstract class A {
    public abstract void show();
}

public class anonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in new Show"); //abstract and anonymous inner class
            }
        };
        obj.show();
    }
}
