package org.example.class21;

public  interface WashAble {
      String name="sdsdsd";
    void wash();

}

class Animal{

}
class Dog extends Animal implements WashAble{

    @Override
    public void wash() {
        System.out.println("You can wash a dog");
    }
}

class Sofa implements WashAble{

    @Override
    public void wash() {
        System.out.println("You can wash a Sofa as well");
    }
}







