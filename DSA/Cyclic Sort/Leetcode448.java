import java.util.ArrayList;
import java.util.List;

public class Leetcode448 {
    public static void main(String[] args) {
        
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int correctIndex = nums[i] - 1;
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=index+1) {
                ans.add(index+1);
            }
        }
        return ans;
        
    } 

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
