class A {
    int age;

    public void show() {
        System.out.println("in Show");
    }

    static class B { // static can use for inner class
        public void config() {
            System.out.println("in Config");
        }
    }
}
public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
        obj1.config();

    }
}
