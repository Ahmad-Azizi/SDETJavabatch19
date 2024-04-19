package org.example.review9;

import java.util.ArrayList;

public class E3 {
    public static void main(String[] args) {
        // Write code to add the numbers and print the sum
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int sum=0;
        for (int a:numbers){
            sum+=a;
        }
        System.out.println(sum);

    }
}
