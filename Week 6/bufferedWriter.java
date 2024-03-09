import java.io.*;

public class bufferedWriter {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Java Course\\Week 6\\File io operation\\java.txt";
        FileWriter writer = null;
        BufferedWriter bwriter = null;
        try {
            File file1=new File(filePath);
            writer=new FileWriter(file1);
            bwriter=new BufferedWriter(writer);
            bwriter.write("Alien");
            bwriter.newLine();
            bwriter.write(66);
            bwriter.newLine();
            bwriter.write(97);
            bwriter.newLine();
            char ch[]={'j','a','v','a'};
            bwriter.write(ch);
            System.out.println("Open java.txt file in your Hard Disk");

        } catch (Exception e) {
            System.out.println("Some Problem");
        }
        finally{
            bwriter.flush();
            bwriter.close();
        }


    }
}
//This is used for SpeedUp the process