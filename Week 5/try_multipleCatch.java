public class try_multipleCatch {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        String str = null;
        int nums[] = new int[5];
        try {
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index");
        } catch (Exception e) {
            System.out.println("Something went Wrong " + e);
        }
        System.out.println(j);
    }
}
