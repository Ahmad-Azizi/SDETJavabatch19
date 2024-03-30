package org.example.class15;

/*
Create a method that will accept a String
as a parameter and return a new String that
consist only of vowels. Method should be available
inside the class only where it was declared and executed
by calling it is name.

 */
public class Task3 {

 private static String getVowels(String str){
        return str.replaceAll("[^aeiouAEIOU]","");
    }

  /*  private static String getVowels(String str){
        String newStr="";
        newStr=str.replaceAll("[^aeiouAEIOU]","");
        return newStr;
    }*/

    /*
    private static String vowelInString(String str) {
        String[] st = str.split("");
        StringBuilder vowel = new StringBuilder();
        for (String s : st) {
            switch (s.toLowerCase()) {
                case "a", "u", "o", "i", "e":
                    vowel.append(s);
            }
        }
        return vowel.toString();
    }
     */

    /*
    private static String vowels(String word){
        String vowels = "";
        for (int i = 0; i<word.length(); i++){
           char vowel = word.toLowerCase().charAt(i);
           if (vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'){
               vowels+=word.charAt(i);
           }
        }
        return vowels;
     */


    public static void main(String[] args) {

        System.out.println(getVowels("Hello"));
    }
}
