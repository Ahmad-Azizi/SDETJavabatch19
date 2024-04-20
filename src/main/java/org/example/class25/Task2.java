package org.example.class25;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
Create a map of countries(5) with its capital that will store countries
in alphabetical order. Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.

 */
public class Task2 {
    public static void main(String[] args) {

        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Morocco","Rabat");
        countries.put("France","Paris");
        countries.put("Turkey","Ankara");
        countries.put("Egypt","Cairo");
        countries.put("India","New Delhi");

        countries.forEach((country, capital)->System.out.println("Country: "+country+", Capital: "+capital));
        countries.values().forEach(capital->System.out.println("Capital: "+capital));

        System.out.println("****************");

        LinkedHashMap<String, Integer> countriesMap=new LinkedHashMap<>();
        countriesMap.put("USA",1);
        countriesMap.put("France",2);
        countriesMap.put("England",3);
        countriesMap.put("Italy",4);
        countriesMap.put("Spain",5);
        var values = countriesMap.values();
        var keys= countriesMap.keySet();
        System.out.println(keys);
        System.out.println(values);
    }
}
