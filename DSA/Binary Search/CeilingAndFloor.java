public class CeilingAndFloor {
    // In that we cover Ceiling of Number and Floor of number
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 9 };
        int target = 5;
        //ceiling
        int ans = ceilingOfNumBS(arr, target);
        System.out.println(ans);
        // floor
        int ans1 = floorOfNumBS(arr, target);
        System.out.println(ans1);
    }

    static int ceilingOfNumBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = end - 1;
                }
            }

        }
        return start;
    }

    static int floorOfNumBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = end - 1;
                }
            }

        }
        return end;
    }
}
