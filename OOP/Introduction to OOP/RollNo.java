public class RollNo{
    public static void main(String[] args) {

        // Student[] s=new Student[5];

        // Student vivek=new Student();
        // // vivek.rno=18;
        // // vivek.name="Vivek Bhosale";
        // // // vivek.marks=91.5f;

        // System.out.println(vivek.rno);
        // System.out.println(vivek.name);
        // System.out.println(vivek.marks);

        Student rahul=new Student(2, "Rahul Khemnar", 75.5f);
        System.out.println(rahul.rno);

        Student random=new Student(rahul);
        System.out.println(random.name);
        
        Student one =new Student();
        Student two=one;
        one.name="Something";
        System.out.println(two.name);
        
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student(){
        this.rno=1;
        this.name="A";
        this.marks=85.1f;
    }
    
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    
    Student (Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }
}