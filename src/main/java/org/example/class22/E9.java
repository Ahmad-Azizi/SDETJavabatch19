package org.example.class22;

public class E9 {

    static int  counter=10;
    String name="jajaj";

    static {
        //System.out.println(name);
    }
  public  E9(){

      // Break till 1:55 PM
    }

    static E9 getInstance(){


      if(counter<100){
          return new E9();
      }else {
          return null;
      }
    }
}
