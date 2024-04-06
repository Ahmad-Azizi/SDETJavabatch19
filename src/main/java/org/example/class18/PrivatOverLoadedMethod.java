package org.example.class18;

public class PrivatOverLoadedMethod {
    private static void method(){
        System.out.println("Empty");
    }
    private static void method(int num){
        System.out.println(num);
    }
    private static void method(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        method();
        method(10);
        method("Asghar");
    }
}