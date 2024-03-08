
//File IO operation
import java.io.*;

public class ioOperation {
    public static void main(String[] args) {
        String filePath = "E:\\Java Course\\Week 6\\File io operation\\java.txt";
        String dirPath = "E:\\Java Course\\Week 6\\File io operation\\Dir";
        try {
            File file1 = new File(filePath);
            // System.out.println(file1.exists());
            // System.out.println(file1.createNewFile());
            // System.out.println(file1.exists());
            System.out.println(file1.getPath());
            System.out.println(file1.isDirectory()); // false
            System.out.println(file1.isFile()); // true

            File dir = new File(dirPath);
            // System.out.println(dir.exists());
            // dir.mkdir();
            // System.out.println(dir.exists());
            System.out.println(dir.isDirectory()); // true
            System.out.println(dir.isFile()); // false

            File file2 = new File("E:\\Java Course\\Week 6");
            String str[] = file2.list();
            int Count = 0;
            for (String name : str) {
                Count++;
                System.out.println(name);
            }
            System.out.println("Number of files on the specified : " + Count);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}