package org.example.class15;

public class Cat {
    private   String name;
    private   String color;
    private  int age;

 public Cat(String cName,String cColor,int cAge){
      name=cName;
      color=cColor;
      if(cAge<30){
          age=cAge;
      }else {
          System.out.println("Wrong value");
      }

  }

    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
