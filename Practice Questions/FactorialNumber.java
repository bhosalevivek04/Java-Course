public class FactorialNumber {
    public static void main(String[] args) {
        FactorialNumber obj = new FactorialNumber();
        System.out.println(obj.factorial(6));
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}