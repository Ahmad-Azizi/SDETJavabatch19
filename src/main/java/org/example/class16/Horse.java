package org.example.class16;

public class Horse {
    private String name;
    private String color;
    private  int age;


    public Horse(String name,String color){
        this.name=name;
        this.color=color;

    }
    public Horse(String name,String color,int age){
        this(name,color);
        this.age=age;
    }
}
