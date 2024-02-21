@FunctionalInterface        //lambda function works with @FunctionalInterface 
interface A {
    // void show(int i, double j);
    int add(int a, int b);
}
public class functional_interface {
    public static void main(String[] args) {
       A obj=(i,j) -> i+j;  //lambda expression to create object of interface and implement the method
        // {
        //    return i+j;     //lambda expression with Return
        // };
       int result=obj.add(5,4);
       System.out.println("Result : "+result);


        // A obj = (int i,double j) -> {
        //     System.out.println("In Show "+i+" "+j);  //lamda Expression
        // };
        // obj.show(5,7.5);
        

        // A obj=new A()
        // {
        // public void show(){
        // System.out.println("In Show");
        // }
        // };
        // obj.show();
    }
}

//lambda function works with functional interface