package com.vivek.polymorphism;

public class Circle extends Shapes{
    @Override //this is annotation use for checking is overridden or not
    void area(){
        System.out.println("Area is 3.14 * r * r");
    }
}
