import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        System.out.println("Count Array for " + exp + " : " + Arrays.toString(count));
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        System.out.println("Count Array after counting " + exp + " : " + Arrays.toString(count));
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.out.println("Output Array " + Arrays.toString(output));
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = { 170, 45, 75, 90, 802, 23 };
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
