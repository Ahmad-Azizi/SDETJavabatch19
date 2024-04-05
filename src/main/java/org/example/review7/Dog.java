package org.example.review7;

public class Dog {

    private String name;
    static int noOfLegs=4;
    public Dog(String name){
        this.name=name;
    }
    void printName(){
        System.out.println(name);
        System.out.println(noOfLegs);
    }
   static void staticPrintName(){
        //System.out.println(name);
       System.out.println(noOfLegs);
    }
}
