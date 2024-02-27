// import java.util.ArrayList;
class Student<T>{
    T obj;
    Student(T obj){
        this.obj=obj;
    }
    public void display(){
        System.out.println("Type of data passed here T : "+obj.getClass().getName());
    }
    public T getObj() {
        return obj;
    }
    
}
public class generics {
    public static void main(String[] args) {
        // String names[]=new String[5];
        // names[0]="Rohan";
        // names[1]="Rohit";
        // names[2]="Virat";

        // //names[3]=10; This line will give compile time error because we are

        // String name1=names[0];
        // String name2=names[1];
        // String name3=names[2];

        // NoTypeSafety without generics
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Rohan");
        // list.add("Rohit");
        // list.add("Virat");
        // list.add(10);

        // String name1 = list.get(0);
        // System.out.println(name1.toUpperCase());
        // String name2 = list.get(1);
        // System.out.println(name2.toUpperCase());
        // String name3 = list.get(2);
        // System.out.println(name3.toUpperCase());

        Student<Integer> st=new Student<>(10);
        st.display();
        System.out.println(st.getObj());
        
        Student<String> st1=new Student<>("Java");
        st1.display();
        System.out.println(st1.getObj());


        // String name1=(String)list.get(0);
        // System.out.println(name1.toUpperCase());

        // String name4=(String)list.get(3);
        // System.out.println(name4.toUpperCase());
    }
}
