package org.example.class25;

import java.util.Map;
import java.util.TreeMap;

/*
Create a Person class with following private fields: Firstname, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print Person details.

In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc.


 */
public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Person> personMap = new TreeMap<>();

        Person person1 = new Person("Lebron", "James", 30, 90000.0);
        Person person2 = new Person("Cam", "Thomas", 25, 60000.0);
        Person person3 = new Person("Lamelo", "Ball", 35, 70000.0);

        personMap.put(1, person1);
        personMap.put(2, person2);
        personMap.put(3, person3);

        personMap.forEach((k,v)-> System.out.println(v));

    }
}

class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}