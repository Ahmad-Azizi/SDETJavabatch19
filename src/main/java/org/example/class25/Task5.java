package org.example.class25;

import java.util.HashMap;
import java.util.Map;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the
highest salary. Output should be in the below format
John Smith=$100000

 */
public class Task5 {
    public static void main(String[] args) {
        Map<String, Double> employeeSalaries = new HashMap<>();
        employeeSalaries.put("Will Acevedo", 10.0);
        employeeSalaries.put("Asghar Nazir", 200000.0);
        employeeSalaries.put("Nikola Acevedo", 5000.0);
        employeeSalaries.put("Ali Acevedo", 8000.0);

        String name="";
        double salary=0;

        for(Map.Entry<String,Double> x:employeeSalaries.entrySet()){

            if(salary<x.getValue()){
                salary=x.getValue();
                name=x.getKey();
            }
        }
        System.out.println(name+" $"+salary);




    }
}
