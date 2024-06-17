public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        // int[] arr={5,4,3,2,1};
        int target=4;
        int ans=orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find order of sorting is ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            // int mid=(start + end)/2; //this may exceed int range
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}