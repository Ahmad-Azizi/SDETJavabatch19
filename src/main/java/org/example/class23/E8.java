package org.example.class23;

import java.util.ArrayList;

public class E8 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList();
        words.add("Cat");
        words.add("Dog");
        words.add("Home");
        words.add("Place");

        System.out.println(words.indexOf("Place"));
        words.remove("Home");
        System.out.println(words.indexOf("Place"));




    }
}
