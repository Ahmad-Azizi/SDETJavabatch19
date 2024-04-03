package org.example.class16;

public class Task2 {
    protected Task2(){
        System.out.println("protected");
    }
    private Task2(String alr){
        System.out.println(alr);
    }
    Task2(int lew){
        System.out.println(lew);

    }

    public Task2(char will){
        System.out.println(will);
    }

    public static void main(String[] args) {
        System.out.println("Hallo!");
    }

}