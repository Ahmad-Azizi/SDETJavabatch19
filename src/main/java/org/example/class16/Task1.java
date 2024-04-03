package org.example.class16;

/*
Write a java class that will have a constructor: one
with parameters and second without any parameters.
Create a separate Test class where you will execute both
of the constructors 1 by 1.
 */
public class Task1 {
   private String name;

  public   Task1(){
        System.out.println("1");
    }

   public Task1(String tName){

      name=tName;
       System.out.println("2");
    }

}
