import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void disp() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}

public class deserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\Java Course\\Week 6\\File io operation\\serial.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Student st = (Student) ois.readObject();
            st.disp();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Some problem");
        }
    }
}
