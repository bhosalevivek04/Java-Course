public class PrimeNumber {

    public static void main(String[] args) {
        int n = 97;
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;

        // if (n <= 1) return false;

        // for (int i = 2; i <n; i++) {
        // if (n % i == 0) {
        // return false;
        // }
        // }
        // return true;
    }
}