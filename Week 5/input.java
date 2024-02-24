import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;

public class input {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter a number");
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(in);
        // int num=Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();
        
        // int num=System.in.read();
        // System.out.println(num-48);
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}
