import java.io.*;

class Student implements Serializable // Marker Interface
{
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

public class serialization {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "Rohan", 16);
        stu1.disp();
        try {
            FileOutputStream fos = new FileOutputStream("E:\\Java Course\\Week 6\\File io operation\\serial.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(stu1);
            System.out.println("Please check the file to see serialized object");
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
