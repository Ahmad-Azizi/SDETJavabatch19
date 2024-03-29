package org.example.review6;

public class E9Methods {

    /*
    create a method which will take a number as input,
    and it is going to print all the numbers starting
    from 0 until that number.
     */

    void printNumbers(int num){

        for (int i = 0; i <=num ; i++) {
            System.out.println(i);
        }

    }


    public static void main(String[] args) {
        E9Methods e=new E9Methods();
        e.printNumbers(5);
    }
}
