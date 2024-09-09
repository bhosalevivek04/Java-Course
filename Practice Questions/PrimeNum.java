public class PrimeNum {
    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        pn.isPrime(83);
    }

    public void isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not prime nimber");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        System.out.println(n + " is prime number");
    }
}
