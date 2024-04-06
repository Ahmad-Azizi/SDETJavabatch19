package org.example.class18;

public class Task2 {

    public static void method(){
        System.out.println("Empty");
    }
    public static void method(int num){
        System.out.println(num);
    }
    public static void method(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        method();
        method(10);
        method("Asghar");
    }
}
