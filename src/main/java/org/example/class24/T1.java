package org.example.class24;

import java.util.LinkedList;
import java.util.List;

/*
Create a Cat class create 3 fields a constructor
and and printInfo method inside it. Create three
objects from this class store them inside the
Linkedlist and call printInfo method using these
three objects.
 */
public class T1 {
    public static void main(String[] args) {


        List<Cat> cats = new LinkedList<>();
        cats.add(new Cat("Nikola", "Dirty blonde", 100));
        cats.add(new Cat("Will", "Grey", 10));
        cats.add(new Cat("Ana", "Off white", 15));
        cats.forEach(x->x.printInfo());
    }
}
