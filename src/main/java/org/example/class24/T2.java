package org.example.class24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class T2 {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("James");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> noDuplicates = new HashSet<>(aList);
        System.out.println(noDuplicates);
    }
    }

