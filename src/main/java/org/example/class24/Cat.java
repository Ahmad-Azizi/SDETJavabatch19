package org.example.class24;

public class Cat {
    private String name;
    private String color;
    private int age;

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

   public void printInfo() {
        System.out.println(name + " " + color + " " + age);
    }
}