
//File IO operation
import java.io.*;

public class ioOperation {
    public static void main(String[] args) {
        try {
            File file1 = new File("E:\\Java Course\\Week 6\\File io operation\\java.txt");
            // System.out.println(file1.exists());
            // System.out.println(file1.createNewFile());
            // System.out.println(file1.exists());
            File dir = new File("E:\\Java Course\\Week 6\\File io operation\\Dir");
            System.out.println(dir.exists());
            dir.mkdir();
            System.out.println(dir.exists());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
