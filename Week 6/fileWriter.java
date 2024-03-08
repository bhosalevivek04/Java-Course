import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        String filePath = "E:\\Java Course\\Week 6\\File io operation\\java.txt";
        FileWriter writer = null;
        try {
            File file1 = new File(filePath);
            writer = new FileWriter(file1,true); // true for append mode, false for overwrite mode

            writer.write("Java");
            writer.write("\n");
            writer.write(65);
            writer.write("\n");
            writer.write(97);
            writer.write("\n");
            char ch[] = { 'a', 'l', 'i', 'e', 'n' };
            writer.write(ch);
            writer.write("\n");

        } catch (Exception e) {
            System.out.println("Some Problem");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
