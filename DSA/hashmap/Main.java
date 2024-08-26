package com.vivek.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        String name = "Vivek"; //82667497
//        Integer a = 2345321; //2345321
//        int code = name.hashCode();
//        System.out.println(code);


        HashMap<String, Integer> map = new HashMap();
        map.put("Vivek", 45);
        map.put("Vishal", 18);
        map.put("Nilesh", 15);

//        System.out.println(map.get("Nilesh"));
//        System.out.println(map.getOrDefault("Manas",20));
        System.out.println(map.containsKey("Vivek"));

        HashSet<Integer> set=new HashSet<>();
        set.add(56);
        set.add(52);
        set.add(55);
        set.add(56);

        System.out.println(set);


        MapUsingHash map1=new MapUsingHash();
        map1.put("Mango","King of fruits");
        map1.put("Apple","Sweet fruit");

        System.out.println(map1.get("Mango"));

        HashMapFinal<String ,String > map2=new HashMapFinal<>();
        map2.put("Mango","King of fruits");
        System.out.println(map2.get("Mango"));

//        KarpRabin Algorithm
        KarpRabin algo=new KarpRabin();
        algo.search("VivekShankarBhosale","Shankar");

    }

}