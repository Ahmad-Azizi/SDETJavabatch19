package org.example.class20;

public  class Parent {


    void printHello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {

       final String name="Java";
      //  name="Manal";
        System.out.println(name);
    }
}
class Child extends Parent{

    @Override
    void printHello() {
        System.out.println("Java");
    }
}
