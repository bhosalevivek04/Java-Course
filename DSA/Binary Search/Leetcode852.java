public class Leetcode852 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
        int[] arr = { 0, 10, 5, 2 };
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of array
                // this may be the answer, but look at left
                end = mid;
            } else {
                // you are in ascending part of array
                start = mid + 1; // because we know that mid+1 element > mid element, hence we ignore
            }
        }
        return start;
    }
}
