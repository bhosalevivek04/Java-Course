package com.vivek.filehandling;

import java.io.*;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws IOException {
        File fo = new File("src/com/vivek/filehandling/new.txt");
        fo.createNewFile();

        try{
            FileWriter fw=new FileWriter("src/com/vivek/filehandling/new.txt");
            fw.write("Hi Bhosale");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        try {
            BufferedReader reader=new BufferedReader(new FileReader("src/com/vivek/filehandling/new.txt"));
            while (reader.ready()){
                System.out.print((char) reader.read());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println();
        }

       try {
           File fo1 = new File("src/com/vivek/filehandling/random.txt");
           fo1.createNewFile();
           if(fo1.delete()){
               System.out.println(fo1.getName());
           }
       }catch (IOException e){
           System.out.println(e.getMessage());
       }

    }
}
