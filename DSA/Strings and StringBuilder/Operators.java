import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1); //integer will be converted to Integer that will call toString()

        System.out.println("Vivek"+new ArrayList<>()); //ArrayList toString method calls here and its output is []
        // System.out.println("Vivek"+new Integer(56));
        // System.out.println(new ArrayList<>()+new Integer(56)); //it will give error
        System.out.println(new ArrayList<>()+""+new Integer(56));

    }
}