public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 2;
        System.out.println(search(arr, target, 0, 2));
    }

    static int search(int arr[], int target, int start, int end) {
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

}
