class A {
    public void showTheData() {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void showTheData() {
        System.out.println("in B show");
    }
}

public class annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheData();
    }
}
