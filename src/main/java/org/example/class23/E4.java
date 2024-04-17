package org.example.class23;

import java.util.ArrayList;

public class E4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("James");
        names.add("Barket");
        names.add("John");
        names.add("Nikola");
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("***********");
       for(String s:names){
           System.out.println(s);
       }

    }
}
