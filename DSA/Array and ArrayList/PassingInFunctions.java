import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
    int[] nums={3,5,6,7,9};
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));
    }

    static void change(int[] nums) {
        nums[0]=50;
    }
}
