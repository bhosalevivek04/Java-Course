import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Java Course\\Week 6\\File io operation\\java.txt";
        FileWriter writer = null;
        PrintWriter print = null;
        try {
            File file1 = new File(filePath);
            writer = new FileWriter(file1);
            print = new PrintWriter(writer);

            print.write(65);// A
            print.write("\n");
            print.println(65);// 65
            print.println("Java");
            print.println('A');
            print.println(true);
            print.println(44.5);

        } catch (Exception e) {
            System.out.println("Some Problem");
        } finally {
            print.close();
        }
    }
}
