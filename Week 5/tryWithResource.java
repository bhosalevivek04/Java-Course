import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class tryWithResource {
    public static void main(String[] args) throws NumberFormatException, IOException {
       int num=0;
       try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
       {
        num=Integer.parseInt(br.readLine());
        System.out.println(num);
        
       }
    //    finally{
    //     br.close(); //finally block is used for close the resources
    //    }
       

        // int i=2;
        // int j=0;
        // try {
        //     j=18/i;
        //     System.out.println(j);
        // } catch (Exception e) {
        //     System.out.println("Something went wrong");
        // }
        // finally{
        //     System.out.println("Bye");
        // }
    }
}