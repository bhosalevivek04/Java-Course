import java.util.Arrays;

public class demo4 {
    //Array class
    public static void main(String[] args) {
        int ar[]={100,20,300,40};
        int ar1[]={100,20,300,40};
        // Arrays.sort(ar);
        // for(int a:ar)
        // {
        //     System.out.print(a+" ");
        // }
        boolean result=Arrays.equals(ar,ar1);
        System.out.println(result);
    }
}
