package org.example.class25;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E8 {
    public static void main(String[] args) {
        //Create an arraylist of Maps

        ArrayList<LinkedHashMap<String,Integer>> listMap=new ArrayList<>();

        LinkedHashMap<String,Integer> fruit=new LinkedHashMap<>();
        fruit.put("Kiwi",25);
        fruit.put("Apple",10);
        fruit.put("Orange",5);
        fruit.put("Banana",30);

        LinkedHashMap<String,Integer> makeUpMap=new LinkedHashMap<>();
        makeUpMap.put("BlushOn",20);
        makeUpMap.put("Lipstick",50);
        makeUpMap.put("EyeLiner",40);
        makeUpMap.put("Foundation",100);

        listMap.add(fruit);
        listMap.add(makeUpMap);

        System.out.println(listMap);

        System.out.println(listMap.get(0).get("Banana"));

    }
}
