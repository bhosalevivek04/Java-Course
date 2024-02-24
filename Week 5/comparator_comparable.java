import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age;
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class comparator_comparable {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) // collection work with wrapper class
            {
                // if (i.age > j.age) {
                //     return 1;
                // } else {
                //     return -1;
                // }
                return i.age>j.age ? 1 :-1; //here we also use lambda
            }
        };

        // List<Integer> nums=new ArrayList<>();
        List<Student> nums = new ArrayList<>();
        nums.add(new Student(23, "Vivek"));
        nums.add(new Student(22, "Vishal"));
        nums.add(new Student(30, "Pratik"));

        // nums.add(49);
        // nums.add(35);
        // nums.add(46);

        Collections.sort(nums,com);
        for (Student s : nums) {
            System.out.println(s);
        }
    }
}