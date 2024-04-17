package org.example.class23;

import java.util.ArrayList;

/*

 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList();
        words.add("Cat");
        words.add("Dog");
        words.add("Home");
        words.add("Place");


        for(int i=0; i<words.size();i++){
            String word=words.get(i);
            if(word.endsWith("e")){
                words.remove(i);
                i--;

            }

        }
        System.out.println(words);
    }
}
