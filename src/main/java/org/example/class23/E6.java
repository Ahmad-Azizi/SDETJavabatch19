package org.example.class23;

import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("James");
        names.add("Barket");
        names.add("John");
        names.add("Nikola");

        for (int i = 0; i < names.size(); i++) {
           /* String n=names.get(i);
            System.out.println(n.length());*/

            System.out.println(names.get(i).length());
        }


    }
}
