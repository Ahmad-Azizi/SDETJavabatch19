package org.example.class22;

public class E10 {

    E10(){
        System.out.println("Important line of code");
        System.out.println("Important line of code");
        System.out.println("Important line of code");
        System.out.println("Important line of code");
        System.out.println("Important line of code");
    }

    E10(String name){
       this(10);
    }

    E10(int a){
  this();
    }

    String color="Brown";
  //  static String color="Not allowed";
    void printInfo(){
        String color="Blue";
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        E10 e10=new E10(10);
      //  e10.printInfo();
    }
}
