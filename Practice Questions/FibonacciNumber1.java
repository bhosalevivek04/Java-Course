public class FibonacciNumber1 {
    public static void main(String[] args) {
        FibonacciNumber1 fb = new FibonacciNumber1();
        fb.fibonacciupto(10);
        System.out.println();

        int ans = fb.fibonacciUsingLoop(10);
        System.out.println(ans);

        int ans1 = fb.fiboWithRec(10);
        System.out.println(ans1);
    }

    public void fibonacciupto(int count) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i <= count; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public int fibonacciUsingLoop(int n) {
        if (n < 2) {
            return n;
        }

        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public int fiboWithRec(int n) {
        if (n < 2) {
            return n;
        }
        return fiboWithRec(n - 1) + fiboWithRec(n - 2);
    }
}
