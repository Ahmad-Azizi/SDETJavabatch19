package org.example.class18;

/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use
constructors make fields private and define printInfo
methods as well create the object of each class and
call the methods

 */
public class Bird {
    private String name;
    private String color;
    private int age;
    private  double weight;

    public Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

  public  void printInfo(){
      System.out.println(name+" "+color+" "+age+" "+weight);
    }
}

class Sparrow extends Bird{
    public Sparrow(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
}

class Parrot extends Bird{
    public Parrot(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
}

class BirdTester{
    public static void main(String[] args) {
        Parrot p=new Parrot("Parro","green",3,1.5);
        p.printInfo();
    }
}