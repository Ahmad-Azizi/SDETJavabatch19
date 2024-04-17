package org.example.class23;

import java.util.ArrayList;

public class E3 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("James");
        names.add("Barket");
        names.add("John");
        names.add("Nikola");
        System.out.println(names.contains("John"));
        System.out.println(names.get(0));
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("John"));
        System.out.println(names.set(0,"Nikola chulo"));
        System.out.println(names);
    }
}
