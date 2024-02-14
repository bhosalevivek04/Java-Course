class Human {
    int age;
    String name;
    
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(){
        age=11;
        name="John";
    }
//     public Human(int a,String n)
//     {
//         age=a;
//         name=n;
//     }
}
public class Constructor {
    public static void main(String[] args) {
    Human obj= new Human();
    // Human obj1=new Human(19,"Vivek");
    // obj.age=11;
    // obj.name="John";
    System.out.println(obj.getName()+" : "+obj.getAge());
    // System.out.println(obj1.name+" : "+obj1.age);
    }
}
