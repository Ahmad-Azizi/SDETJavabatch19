package org.example.class23;

import java.util.ArrayList;

public class E5 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("James");
        names.add("Barket");
        names.add("John");
        names.add("Nikola");

        names.forEach(x-> System.out.println(x));
        names.forEach(x-> System.out.println(x.length()));


    }
}
