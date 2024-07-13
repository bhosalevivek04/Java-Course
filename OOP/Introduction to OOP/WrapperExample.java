public class WrapperExample {
    public static void main(String[] args) {
        // int a=10;
        // int b=20;

        // Integer num =45;
        
        // Integer a=10;
        // Integer b =20;
        // swap(a, b);
        // System.out.println(a+" "+b);
        // swap(5, 10);

        // final int bonus=2;
        // bonus=5;

        final A abc = new A("Vivek");
        abc.name="other";
        System.out.println(abc.name);
       
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj=new A("Random  name");
        }
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}

class A{
    final int num=10;
    String name;
    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}