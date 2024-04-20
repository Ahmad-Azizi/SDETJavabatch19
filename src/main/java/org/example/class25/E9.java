package org.example.class25;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E9 {
    public static void main(String[] args) {
        Map<Integer,String> students=new TreeMap<>();
        students.put(1,"Nikola");
        students.put(6,"Will");
        students.put(7,"Ali");
        students.put(3,"Nikola");
        students.put(2,"Nikola");
        System.out.println(students);
      Set<Map.Entry<Integer,String>> entrySet= students.entrySet();
        //ArrayList<Map.Entry<Integer,String>> entries=new ArrayList<>();
        entrySet.removeIf(x->x.getKey()>3&&x.getValue().contains("l"));
        System.out.println(students);



    }
}
