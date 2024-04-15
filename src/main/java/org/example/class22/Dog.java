package org.example.class22;


class Animal{
     String name;
    String color;
    void printInfo(){
        System.out.println(name+" "+color);
    }
}

class Mammal extends Animal{
    String name="Jack";
    boolean milk=true;

    public Mammal(String name, boolean milk) {
        this.name = name;
        this.milk = milk;
    }
}

class Cat extends Mammal{
    String name="James";

    public Cat(String name, boolean milk) {
        super(name, milk);
    }

    void printName(){
        String name="John";
        System.out.println(super.name);
    }

}
public class Dog extends Mammal{


    public Dog(String name, boolean milk) {
        super(name, milk);
    }
}

class Tester{
    public static void main(String[] args) {
        Dog d=new Dog("Jajaj",true);
        d.name="jiki";
        d.color="Black";
        d.printInfo();
    }
}
