package org.example.class22;

public class E8 extends E6{

    void printInfo(){
        System.out.println(name);
        System.out.println(userName);
        System.out.println(email);
       // System.out.println(password);
    }
    public static void main(String[] args) {
        E6 e6=new E6();
        System.out.println(e6.name);
        System.out.println(e6.userName);
        System.out.println(e6.email);
       // System.out.println(e6.password);
    }
}
