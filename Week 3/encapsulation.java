//Encapsulation //Below that code Getters and Setters
class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
   
}
public class encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(11);
        obj.setName("Vivek");
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}

/*Getters and Setters
1.right click
2.click on Source Action
3.click on Generate Getters and Setters
4.click variables you want to generate
also refer This_keyword.java
*/