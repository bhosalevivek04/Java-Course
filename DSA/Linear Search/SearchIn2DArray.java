import java.util.Arrays;

public class SearchIn2DArray {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3 },
        { 4, -9, 6 },
        { 7, 8, 9, 26, 14 }
    };
    int target = 14;
    int[] ans = search(arr, target);
    System.out.println("Found element " + target + " at index :" + Arrays.toString(ans));
    System.out.println("Maximum value in the array: " + max(arr));
    System.out.println("Minimum value in the array: " + min(arr));
  }

  static int[] search(int arr[][], int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return new int[] { row, col };
        }
      }
    }
    return new int[] { -1, -1 };
  }

  static int max(int[][] arr) {
    int max = arr[0][0];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (max < arr[row][col]) {
          max = arr[row][col];
        }
      }
    }
    return max;
  }

  static int min(int[][] arr) {
    int min = arr[0][0];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (min > arr[row][col]) {
          min = arr[row][col];
        }
      }
    }
    return min;
  }
}