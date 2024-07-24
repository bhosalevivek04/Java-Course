package com.vivek.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student vivek=new Student(9,80.44f);
        Student aayush=new Student(7,84.40f);
        Student piyush=new Student(6,77.46f);
        Student tejas=new Student(44,94.40f);

    Student[] list={vivek,aayush,piyush,tejas};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> {
            return (int)(o1.marks-o2.marks );
//                return -(int)(o1.marks-o2.marks );
        });
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks-o2.marks );
////                return -(int)(o1.marks-o2.marks );
//            }
//        });

        System.out.println(Arrays.toString(list));



//        if (vivek.compareTo(aayush)<0){
//            System.out.println(vivek.compareTo(aayush));
//            System.out.println("Ayush has more marks");
        }
    }
