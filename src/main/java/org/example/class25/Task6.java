package org.example.class25;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        Set<String> name=new LinkedHashSet<>();
        name.add("I");
        name.add("need");
        name.add("to practice");
        name.add("more");

        String str="";
        for (String s : name) {
          str=str+" "+s;
        }
        System.out.println(str);
    }
}
