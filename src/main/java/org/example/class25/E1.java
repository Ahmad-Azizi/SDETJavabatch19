package org.example.class25;

import java.util.HashMap;

public class E1 {
    public static void main(String[] args) {

        HashMap<String,Integer> makeUpMap=new HashMap<>();
        makeUpMap.put("BlushOn",20);
        makeUpMap.put("Lipstick",50);
        makeUpMap.put("EyeLiner",40);
        makeUpMap.put("Foundation",100);

        System.out.println(makeUpMap.get("Lipstick"));
        System.out.println(makeUpMap.size());
        System.out.println(makeUpMap.containsKey("EyeLiner"));
        System.out.println(makeUpMap.containsValue(45));
        System.out.println(makeUpMap.isEmpty());


    }

}
