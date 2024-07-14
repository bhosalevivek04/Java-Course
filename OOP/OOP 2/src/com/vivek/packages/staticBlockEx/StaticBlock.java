package com.vivek.packages.staticBlockEx;

public class StaticBlock {
    static int a=4;
    static int b;
// will only run once, when the first obj is create i.e. when the class is loaded first time
    static {
        System.out.println("I am in Static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
