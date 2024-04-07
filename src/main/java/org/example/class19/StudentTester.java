package org.example.class19;

public class StudentTester {
    public static void main(String[] args) {
        Student [] arr={new syntaxStudent(),new collegeStudent(),new schoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            Student a=arr[i];
            a.eat();
            a.walk();
            a.work();

        }
    }
}