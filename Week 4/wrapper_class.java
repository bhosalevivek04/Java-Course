public class wrapper_class {
    public static void main(String[] args) {
        // every primitive type we hava class of it
        int num = 7;
        // Integer Num = new Integer(7); //Integer is a Wrapper Class for int,char etc.
        Integer num1 = num; // auto-boxing

        int num2 = num1;/* num1.intValue(); */ // auto-unboxing
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);// parse from string to int
        System.out.println(num3 * 2);

    }
}
