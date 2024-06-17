import java.util.Arrays;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Leetcode34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };     
        int target = 7;
        // Print the result of the searchRange function
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        // Search for the start index of the target value
        int start = search(nums, target, true);
        // Search for the end index of the target value
        int end = search(nums, target, false);
        // Store the start and end indices in the result array
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Check if the target value is less than the mid element
            if (target < nums[mid]) {
                // Update the end index
                end = mid - 1;
            } else if (target > nums[mid]) {
                // Update the start index
                start = mid + 1;
            } else {
                // Update the result index
                ans = mid;
                // Update the start or end index based on the findStartIndex flag
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}