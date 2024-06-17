import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-8,-5,-2,1,2,3,4,5,6,7,8};
        int target=11;
        int ans=binarySearch(arr,target);
        System.out.println("Find element at Index: "+ans);
    }
    static int binarySearch(int[] arr,int target){
        // Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            // int mid=(start + end)/2; //this may exceed int range
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
