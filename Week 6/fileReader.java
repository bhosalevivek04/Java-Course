import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        String filePath = "E:\\Java Course\\Week 6\\File io operation\\java.txt";
        FileReader reader = null;
        try {
            File file1 = new File(filePath);
            reader = new FileReader(file1);
            char ch[] = new char[(int) file1.length()];
            reader.read(ch);

            for (char c : ch) {
                System.out.println(c);
            }

            // int i = reader.read();
            // System.out.println(i);
            // // System.out.println((char)i);
            // while (i != -1) {
            // System.out.println(i+"=>");
            // System.out.println((char) i);
            // i = reader.read();
            // }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
