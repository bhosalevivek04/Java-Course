//Exception Handling
public class tryCatch {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            j = 8 / i;
        } catch (Exception e) {
            System.out.println("Something went wrong "+e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
