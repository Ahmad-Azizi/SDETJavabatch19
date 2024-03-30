package org.example.class15;

public class User {
   private String userName;
   private String password;

  public String name;
  public   int age;
   private   void displayUserName(){
        System.out.println(userName);
    }

    public void printName(){
        System.out.println(name);
    }
    public static void main(String[] args) {

      User u=new User();
      u.userName="user123";
      u.password="Pass123";
      u.displayUserName();
      u.name="David";
      u.age=123;
      u.printName();

    }

}


