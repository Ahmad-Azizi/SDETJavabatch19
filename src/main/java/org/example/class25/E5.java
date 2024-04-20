package org.example.class25;

import java.util.Set;
import java.util.TreeMap;

public class E5 {
    public static void main(String[] args) {

        TreeMap<String,Double> fruit=new TreeMap<>();
        fruit.put("Kiwi",25.5);
        fruit.put("Apple",10.5);
        fruit.put("Orange",5.5);
        fruit.put("Banana",30.5);

        fruit.forEach((k,v)-> System.out.println(k+" "+v));

        Set<String> keys= fruit.keySet();
        keys.removeIf(x->x.contains("a")||x.contains("A"));
        System.out.println(fruit);












    }
}
