package com.vivek.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <5; i++) {
            arr.add(i);
        }

        Consumer<Integer> fun=(item)-> System.out.println(item*2);
//        arr.forEach((item)-> System.out.println(item*2));
        arr.forEach(fun);
        Operation sum=(a,b)-> a + b;
        Operation prod=(a,b)-> a * b;
        Operation sub=(a,b)-> a - b;

        LambdaFunctions calc=new LambdaFunctions();
        System.out.println("My Calculator");
        System.out.println(calc.operate(5,3,sum));
        System.out.println(calc.operate(5,3,prod));
        System.out.println(calc.operate(5,3,sub));

    }



    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }

//    int sum(int a,int b){
//        return a+b;
//    }
}
interface Operation{
    int operation(int a,int b);
}
