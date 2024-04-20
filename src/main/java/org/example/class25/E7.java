package org.example.class25;

import java.util.ArrayList;

public class E7 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> syntaxStudents=new ArrayList<>();

        ArrayList<String> females=new ArrayList<>();
        females.add("Sheila");
        females.add("Olga");
        females.add("Tai");

        ArrayList<String> males=new ArrayList<>();
        males.add("Nikola");
        males.add("Diane");
        males.add("Olga");
        males.add("Matt");

        syntaxStudents.add(females);
        syntaxStudents.add(males);
        System.out.println(syntaxStudents);
    }
}
