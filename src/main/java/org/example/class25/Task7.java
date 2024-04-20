package org.example.class25;

import java.util.ArrayList;
import java.util.List;

/*
Create a collection of integers in which you
can keep duplicates.
Write a logic to find sum of all integers

 */
public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(25);
        numbers.add(73);
        numbers.add(22);
        numbers.add(100);
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        System.out.println(sum);
    }
}
