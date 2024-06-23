public class GCD_LCM {
    public static void main(String[] args) {
        // Calculate and print the GCD of 4 and 9
        System.out.println("The GCD is: " + gcd(4, 9));
        System.out.println("The LCM is: " + lcm(2, 9));

    }

    static int gcd(int a, int b) {
        // hcf
        // Base case: if a is 0, the GCD is b
        if (a == 0) {
            return b;
        }
        // Recursive case: calculate the GCD of b % a and a
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else
            return (a * b) / gcd(a, b);
    }
}