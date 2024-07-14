package com.vivek.packages.InnerClass;

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("Vivek");
        Test b=new Test("Vishal");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
