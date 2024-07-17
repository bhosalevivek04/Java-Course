package com.vivek.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Xyz, She is 21");
    }
}
