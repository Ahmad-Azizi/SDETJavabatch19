package org.example.class24;

import java.util.*;

public class E5 {
    public static void main(String[] args) {

        Set<Integer> numbers=new LinkedHashSet<>();
        numbers.add(50);
        numbers.add(50);
        numbers.add(23);
        numbers.add(45);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println("**************************");
        for(Integer i:numbers){
            System.out.println(i);
        }
        System.out.println("**************************");
        numbers.forEach(x-> System.out.println(x));
        System.out.println("**************************");
        List<Integer> integerList=new ArrayList<>(numbers);
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }

    }
}
