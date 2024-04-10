package org.example.class20;

public class AnimalTester {
    public static void main(String[] args) {

        Animal [] animals={new Dog("Jacky","Black",12),
                new Cat("Lulu","White",10)};
        for (int i = 0; i <animals.length ; i++) {
            Animal a=animals[i];
            a.eat();
            a.sleep();
            a.speak();
            a.printInfo();

        }

        //Animal a=new Animal()
        Dog d=new Dog("Jacky","Black",12);
        d.eat();
        d.printInfo();;
        Animal.printHello();

    }
}
