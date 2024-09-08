import java.util.Arrays;
public class AppendZeroAtEnd{
    public static void main(String[] args){
        int arr[]={1,0,3,2,0,5,0,7,0};
        int index=0;
        int[] arr1=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[index] = arr[i];
                index++; 
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}