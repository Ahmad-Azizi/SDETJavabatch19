package org.example.class15;

public class Dog {

  static   String name;
    int age;

    void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Jacky";
        d1.age=23;
        d1.printName();
    }
}
