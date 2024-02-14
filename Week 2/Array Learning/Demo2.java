class Student {
    int rollNo;
    String Name;
    int Marks;
    
}
public class Demo2 {
    public static void main(String[] args) {
       
       //creating object of the first student
       Student s1=new Student();
       s1.rollNo=1;
       s1.Name="Vivek";
       s1.Marks=87;

       Student s2=new Student();
       s2.rollNo=2;
       s2.Name="Navnath";
       s2.Marks=67;
       
       Student s3=new Student();
       s3.rollNo=2;
       s3.Name="Pratik";
       s3.Marks=77;
       
       Student students[]=new Student[3];
       students[0]=s1;
       students[1]=s2;
       students[2]=s3;

       for(int i=0;i<students.length;i++)
       {
        System.out.println(students[i].Name+" : "+students[i].Marks);
       }
    
    /* Enhanced For loop
    for(Student stud : students)
    {
        System.out.println(stud.Name+" : "+stud.Marks);
    }
    */
       
       
       
       
       
       
       
       
       
        // int info[]=new int[4];
        // info[0]=4;
        // info[1]=3;
        // info[2]=5;
        // info[3]=8;
        // for(int i=0;i<info.length;i++)
        // {
        //     System.out.println(info[i]);
        // }
    }
}
