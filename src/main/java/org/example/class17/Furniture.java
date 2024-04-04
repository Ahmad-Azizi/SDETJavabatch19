package org.example.class17;

public class Furniture {
    String color="Black";
}
class Chair extends Furniture{
    String color="White";

    void printColor(){
        String color="Purple";
        System.out.println(super.color);
    }
}
class FurTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}