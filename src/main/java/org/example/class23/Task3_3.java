package org.example.class23;

import java.util.ArrayList;

/*

 */
public class Task3_3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList();
        words.add("Cat");
        words.add("Dog");
        words.add("Home");
        words.add("Place");
        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);
        words.forEach(x-> System.out.println(x));
    }
}
