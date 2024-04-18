package org.example.class23;

import java.util.ArrayList;

/*
Create an arrayList of even numbers from 1 to 500
using a loop. Then Remove any
number that is divisible by 5 from that arrayList.
 */
public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <=500 ; i=i+2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.removeIf(c->c%5==0);
        System.out.println(numbers);

    }

}
