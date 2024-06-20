import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int nums[] = { 6, 8, 1, 2, 3 };
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // Check if the number is within the valid range and not already in the correct position
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int correctIndex = nums[i] - 1;
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // After cyclic sort, the array should be partially sorted
        Arrays.sort(nums);
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
