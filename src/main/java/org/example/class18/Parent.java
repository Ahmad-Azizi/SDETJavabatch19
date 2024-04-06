package org.example.class18;

public class Parent {
    String firstName="Jack";
}
class Child extends Parent{

    String firstName ="Taras Java Guru";
    void printName(){
        String firstName="Sam";
        System.out.println(super.firstName);

    }
}
class ParentTester{
    public static void main(String[] args) {
        Child c=new Child();
        c.printName();
    }
}
