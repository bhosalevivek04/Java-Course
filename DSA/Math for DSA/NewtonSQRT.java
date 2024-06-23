public class NewtonSQRT {
    public static void main(String[] args) {
        double x = 40;
        System.out.println("The square root of " + x + " is:");
        System.out.print(sqrt(x));
    }

    public static double sqrt(double n) {
        double x=n;
        double root;
        while (true) {
            root=0.5*(x+(n/x));
            if (Math.abs(root-x)<0.5) {
                break;
            }
            x=root;
        }
        return root;
    }

}
