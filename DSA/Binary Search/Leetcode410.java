public class Leetcode410 {
    public static void main(String[] args) {
        // nums = [1,2,3,4,5], k = 2
        int[] nums={1,2,3,4,5};
        int k=2;
        System.out.println(splitArray(nums, k));
    }
    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start, nums[i]);
            end+=nums[i];
        }
        while (start< end) {
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int num : nums) {
                if (sum+num > mid) {
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if (pieces>k) {
                start=mid+1;
            } else {
                end=mid;
            }
        }
        return end;
    }
}
