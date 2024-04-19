package org.example.review9;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class E7 {
    public static void main(String[] args) {

        Set<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Able");
        fruit.add("Kiwi");
        fruit.add("Orange");
        System.out.println(fruit);

        LinkedList<String> fruitList=new LinkedList<>(fruit);
        System.out.println(fruitList);
    }
}
