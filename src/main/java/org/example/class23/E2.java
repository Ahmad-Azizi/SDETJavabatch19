package org.example.class23;

import java.util.ArrayList;

public class E2 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList();
        names.add("James");
        names.add("Barket");
        names.add("John");
        names.add("Nikola");
        System.out.println(names);
        System.out.println(names.size());
        names.remove("John");
        System.out.println(names);
        System.out.println(names.size());
        names.remove(0);
        System.out.println(names);





    }
}
