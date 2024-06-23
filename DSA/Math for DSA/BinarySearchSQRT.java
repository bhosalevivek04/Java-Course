public class BinarySearchSQRT {
    public static void main(String[] args) {
        int number = 40;
        int precision = 3;
        System.out.printf("%.3f", calculateSquareRoot(number, precision));
    }

    // Time Complexity: O(log(n))
    static double calculateSquareRoot(int number, int precision) {
        int start = 0;
        int end = number;
        double root = 0.0;

        // Binary search to find the integer part of the square root
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == number) {
                return mid;
            }
            if (mid * mid > number) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Refine the result to the desired precision
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= number) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}