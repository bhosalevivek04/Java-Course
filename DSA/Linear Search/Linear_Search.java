public class Linear_Search {
    public static void main(String[] args) {
       int[] nums={1,2,3,4,5,6};
       int target=4;
    //    int ans=linearSearch(nums, target);
    //    int ans=linearSearch2(nums, target);
    boolean ans=linearSearch3(nums, target);
    System.out.println("Element Found"+ans); 

    }
   
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int element : arr) {
            if (element==target) {
                return element;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if (element==target) {
                System.out.println("Element Found");
                return element;
            }
        }
        // return -1;
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int element : arr) {
            if (element==target) {
                System.out.println("Element Found");
                return true;
            }
        }
        return false;
    }
}