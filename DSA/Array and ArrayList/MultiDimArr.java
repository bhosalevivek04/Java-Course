import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArr {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // Initialize rows

//       System.out.println(arr.length); // Print the number of rows

        Scanner in = new Scanner(System.in);

        // Read input into the array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


//        // Print the array
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        for (int row=0;row< arr.length;row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        in.close(); // Close the scanner
    }
}
