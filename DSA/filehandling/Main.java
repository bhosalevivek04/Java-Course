package com.vivek.filehandling;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        try (InputStreamReader isr=new InputStreamReader(System.in)){
//            System.out.print("Enter some letters: ");
//            int letters= isr.read();
//            while (isr.ready()){
//                System.out.println((char) letters);
//                letters=isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


//        try (FileReader fr=new FileReader("src/com/vivek/filehandling/note.txt")){
//            int letters= fr.read();
//            while (letters != -1) {
//                System.out.print((char) letters);
//                letters = fr.read();
//            }
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
//            System.out.println("You typed: "+br.readLine());
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedReader br=new BufferedReader(new FileReader("src/com/vivek/filehandling/note.txt"))){
//            while (br.ready()){
//                System.out.println(br.readLine());            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


        //Output
//        OutputStream os=System.out;
//        os.write(25);
//        System.out.println();

        try (OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(99);
            osw.write('A');
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileWriter fw=new FileWriter("src/com/vivek/filehandling/note.txt",true)){
            fw.write(" Hello World");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw=new BufferedWriter(new FileWriter("src/com/vivek/filehandling/note.txt",true))){
            bw.write(" Hello Vishal");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
