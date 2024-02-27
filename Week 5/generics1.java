import java.util.ArrayList;
import java.util.List;

class Human {
    public void sleep() {
        System.out.println("Human need to sleep well");
    }
}

class Employee extends Human {
    public void sleep() {
        System.out.println("Employee need to sleep well to stay productive");
    }
}

public class generics1 {
    public static void main(String[] args) {
        Human human = new Human();
        Employee emp = new Employee();
        human = emp;
        // ArrayList<Human> humanList=new ArrayList<>();
        // ArrayList<Employee> empList=new ArrayList<>();

        // ArrayList<Human> humanList1=new ArrayList<>();
        // humanList=humanList1;

        // ArrayList<?> humanList=new ArrayList<>();
        // ArrayList<Employee> empList=new ArrayList<>();
        // humanList=empList;
        // ArrayList<Human> humanList1=new ArrayList<>();
        // humanList=humanList1;

        // ArrayList<? extends Human> humanList = new ArrayList<>();
        // ArrayList<Employee> empList = new ArrayList<>();
        // ArrayList<String> stringList = new ArrayList<>();
        // ArrayList<Object> objList = new ArrayList<>();

        // ArrayList<Human> humanList1 = new ArrayList<>();
        // humanList =empList;
        // humanList=humanList1;

        // humanList=stringList;
        // humanList=objList;

        Human human2=new Human();
        Employee emp2=new Employee();

        ArrayList<? super Human> humanList = new ArrayList<>(); // lowerbound
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp);
        empList.add(emp2);

        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Object> objList = new ArrayList<>();

        ArrayList<Human> humanList1 = new ArrayList<>();
        humanList1.add(human);
        humanList1.add(human2);

        // involkeSleep(empList);
        involkeSleep(humanList1);

        // humanList =empList;
        // humanList=stringList;
        
        // humanList = humanList1;
        // humanList = objList;
    }
    // public static void involkeSleep(List<? extends Human> list){
        public static void involkeSleep(List<? super Human> list){
        for (Object human : list) {
            // human.sleep();
        }
    }
}
