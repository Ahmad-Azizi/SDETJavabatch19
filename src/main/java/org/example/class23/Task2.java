package org.example.class23;

import java.util.ArrayList;

/*
Create an arrayList of drinks call it.
If any drink has letter “a” or “e” replace the
whole word with water.

 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> drinkList=new ArrayList();
        drinkList.add("Cola");
        drinkList.add("juice");
        drinkList.add("Sprite");


        for(int i=0; i<drinkList.size();i++){
            String drink=drinkList.get(i);
            if(drink.contains("a")|| drink.contains("e")){
                drinkList.set(i,"water");

            }

        }
        System.out.println(drinkList);

    }
    }

