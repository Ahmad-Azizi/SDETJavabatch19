package org.example.class25;

import java.util.HashMap;
import java.util.Map;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer,
7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.

 */
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuyMap = new HashMap<>();

        bestBuyMap.put(7664847, "Printer");
        bestBuyMap.put(7879885, "TV");
        bestBuyMap.put(7894561, "Laptop");
        bestBuyMap.put(7851236, "Smartphone");
        bestBuyMap.put(7820145, "Headphones");

        bestBuyMap.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
    }}
