package org.example.class15;

import java.util.Scanner;

public class CatTester {
    public static void main(String[] args) {
       /* Cat C1 = new Cat("Meowth","White",5);
        C1.name="Meowth";
        C1.age=500;
        C1.color="White";
        C1.printInfo();*/

        Cat C1 = new Cat("Meowth","White",5);
        C1.printInfo();

        Scanner scanner=new Scanner(System.in);
        StringBuilder str=new StringBuilder("Java");
        String str2=new String("Monday");



       /* Cat C2 = new Cat();
        C2.name="Glameow";
        C2.age=2;
        C2.color="brown";
        C2.printInfo();*/

        Cat c2=new Cat("Glameow","brown",2);
        c2.printInfo();

    }
}
