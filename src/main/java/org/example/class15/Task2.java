package org.example.class15;

/*
Create a method that will take a String as a parameter
 and returns reversed String. Method should be available
  to all classes within your project
   and accessible by class name.
 */
public class Task2 {

   /* public static String reverseStr(String str){

        return new StringBuilder(str).reverse().toString();
    }
*/

    public static String reverseStr(String str){

       String reversedStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr=reversedStr+str.charAt(i);
        }
      return reversedStr;
    }

      public static void  main(String[] args) {

        System.out.println(Task2.reverseStr("Monday"));


    }

}
