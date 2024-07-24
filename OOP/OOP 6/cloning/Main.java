package com.vivek.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
         Human vivek=new Human(20,"Vivek Bhosale");
//         Human twin=new Human(vivek);

        Human twin=(Human) vivek.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(vivek.arr));


    }
}
