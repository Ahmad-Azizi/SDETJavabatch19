package org.example.class17;

public class E {

    static void printF(){
        System.out.println("Asghar hates me");
    }
}
class F extends E{


}
class Tester{
    public static void main(String[] args) {

        F a = new F();
        F.printF();

    }
}