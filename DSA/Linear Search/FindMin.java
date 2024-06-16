public class FindMin {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 2, 3, 8, 9, 74, 6, 5 };
        System.out.println("Minimum element is: " + findMin(arr));
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        };
        return min;
    }
}
