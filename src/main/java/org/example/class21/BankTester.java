package org.example.class21;

public class BankTester {
    public static void main(String[] args) {

        BankAccount b=new BankAccount("Will","User123","Pass123");
        System.out.println(b.getName());
        b.setName("James");
        System.out.println(b.getName());
    }
}
