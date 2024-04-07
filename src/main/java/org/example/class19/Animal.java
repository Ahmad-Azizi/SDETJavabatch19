package org.example.class19;

public class Animal {
    void sleep(){
        System.out.println("Animals sleep");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}

class Dog extends Animal{


      @Override
      void sleep(){
        System.out.println("Dog like to sleep 6 to 8 hours");

    }
}

class Cat extends Animal{

}

class AnimalTester{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sleep();
        d.eat();
    }
}
