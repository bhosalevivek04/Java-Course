public class Leetcode154 {
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {  // nums[mid] == nums[right]
                end--;  // Reduce the search space
            }
        }
        return nums[start];
    }
}