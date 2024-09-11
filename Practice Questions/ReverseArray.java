import java.util.*;
// https://www.naukri.com/code360/problems/reverse-the-array_1262298
public class ReverseArray {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        int start = m + 1;
        int end = arr.size() - 1;

        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        reverseArray(arr, 3);
        System.out.println("Reversed array: " + arr);

    }
}
