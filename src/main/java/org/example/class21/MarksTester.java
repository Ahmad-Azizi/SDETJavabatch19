package org.example.class21;

public class MarksTester {
    public static void main(String[] args) {
        Marks[] marks = {new A(75, 70, 84), new B(74, 85, 92, 95)};
        for (Marks marks1:marks){
            System.out.println(marks1.getAverage());
        }

    }
}