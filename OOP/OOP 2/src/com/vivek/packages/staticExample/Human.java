package com.vivek.packages.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(String name, int salary, boolean married, int age) {
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.age = age;
        Human.population+=1;
    }
}
