package com.vivek.stringbuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer();
//
//        StringBuffer sb2=new StringBuffer("Vivek Bhosale");
//
//        StringBuffer sb3=new StringBuffer(30);
//
//        sb.append("WeMakeDevs");
//        sb.append(" is nice!");
////        sb.insert(2," Vishal ");
//        sb.replace(2,6,"Bhosale");
//        sb.delete(1,5);
////        sb.reverse();
//
//        System.out.println(sb.capacity());
//
//        String str=sb.toString();
//        System.out.println(str);

        int n=20;
        String name=RandomString.generate(n);
        System.out.println(name);

        //remove whitespace
        String sentence="Vivek Shankar Bhosale";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s",""));

        //split
        String arr="Vivek Vishal Nilesh";
        String[] names=arr.split(" ");
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df=new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
}