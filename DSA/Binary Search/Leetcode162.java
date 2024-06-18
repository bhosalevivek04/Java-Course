public class Leetcode162 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(findPeakElement(nums));
    }    
    // https://leetcode.com/problems/find-peak-element/description/
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
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
