public class stringExample{
    public static void main(String[] args) {
        String name="Vivek Bhosale"; //Strings are store in String pool inside heap
        // System.out.println(name);
        String b="Vivek Bhosale";
        // System.out.println(b);
        b="Vivek";
        System.out.println(name);//Strings are immutable
        System.out.println(b);
    }
}