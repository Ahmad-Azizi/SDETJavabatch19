package org.example.class24;

import java.util.LinkedList;

public class E2 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(50);
        numbers.add(200);
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);

        System.out.println(numbers);
        numbers.add(1,105);
        System.out.println(numbers);

    }
}
