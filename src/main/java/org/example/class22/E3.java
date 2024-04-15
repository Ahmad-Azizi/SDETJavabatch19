package org.example.class22;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is Palidrome?");
        String A=sc.nextLine();
        StringBuilder stbld= new StringBuilder(A);
        stbld.reverse();
        String reversed = stbld.toString();

        if (reversed.equals(A)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        // Break till 11:51
    }
}
