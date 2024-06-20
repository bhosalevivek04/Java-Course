public class Comparison {
    public static void main(String[] args) {
        String a="Vivek";
        String b="Vivek";
        System.out.println(a==b); //true bcz it pointing the same object

        String name1=new String("Vivek"); //it will store outside the String pool bit inside heap
        String name2=new String("Vivek");
        // System.out.println(name1==name2); //false bcz its different object
        System.out.println(name1.equals(name2)); //it will check only value

        System.out.println(name1.charAt(0));
    }
}
