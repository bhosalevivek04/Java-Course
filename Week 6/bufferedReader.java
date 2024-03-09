import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Java Course\\Week 6\\File io operation\\java.txt";
        FileReader reader = null;
        BufferedReader br = null;
        try {
            File file1=new File(filePath);
            reader=new FileReader(file1);
            br=new BufferedReader(reader);
            String str=br.readLine();
            while (str!=null) {
                System.out.println(str);
                str=br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Some Problem");
        } finally {
            br.close();
        }
    }
}
