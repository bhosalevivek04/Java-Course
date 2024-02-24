// import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        // Map<String,Integer> students=new HashMap<>();
        Map<String,Integer> students=new Hashtable<>();
        students.put("Vivek",18);
        students.put("Aayush",16);
        students.put("Piyush",17);
        students.put("Vaibhav",15);
        students.put("Aayush",19); //updating the value of Aayush to 16 from 19
        
        System.out.println(students.keySet());
        for(String key:students.keySet())
        {
            System.out.println(key+" "+students.get(key));
        }
        // System.out.println(students);
    }
}
