package com.vivek.packages.staticExample;

public class Main {
    public static void main(String[] args) {
        Human vivek=new Human("Vivek",50000,false,20);
        Human vishal=new Human("Vishal",150000,true,23);
        System.out.println(vivek.name);
        System.out.println(Human.population);
//        static method can access only static data not non static
//        greeting();
        Main funn=new Main();
        funn.fun2();
    }
//    we know that something which is not static belongs to an object
    static void greeting(){
//        fun();
        //you cannot access non static stuff without referencing their instances in a static context
        //hence , here i am refering it
        System.out.println("Hello World");
//        Main obj=new Main();
//        obj.fun2();

    }
    void fun(){
        System.out.println("Enjoy");
//        greeting();
    }
    void fun2(){
        greeting();
    }
}
