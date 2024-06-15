import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Array of primitives
//        int[] arr=new int[5];
//        for(int i=0;i< arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//        for (int i=0;i<arr.length;i++) {
//            System.out.print(arr[i]+" ");
////        }
//        for (int nums:arr) {
//            System.out.print(nums+ " ");
//        }

//        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str=new String[5];
        for (int i=0;i< str.length;i++) {
            str[i]=in.next();
        }
//        str[0]="a";
        System.out.println(Arrays.toString(str));
    }
}
