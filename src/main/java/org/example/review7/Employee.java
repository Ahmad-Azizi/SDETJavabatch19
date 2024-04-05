package org.example.review7;

public class Employee {
    private String name;
    private  int age;
    private  double salary;
   public static String companyName="Google";

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

  public double getBonus(){
        if(age>50){
            return 2*salary;
        }else{
            return salary;
        }
    }

    public  boolean shouldRetire(){

        if(age>60){
            return true;
        }else {
            return false;
        }
    }


    public  static String getCompanyName(){
        return companyName;
    }
    public  void printInfo(){
        System.out.println(name+" "+age+" "+salary+ " "+getBonus());
    }
}
