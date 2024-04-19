package org.example.review9;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Nick",12345));
        students.add(new Student("John",65481));
        students.add(new Student("Will",65983));

        students.forEach(x-> x.printInfo());
    }
}