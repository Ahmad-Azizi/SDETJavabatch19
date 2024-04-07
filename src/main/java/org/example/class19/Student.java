package org.example.class19;

public class Student {
    void work(){
        System.out.println("Student works");
    }
    void eat(){
        System.out.println("Student eats");
}
    void walk(){
        System.out.println("Student walks");
    }
}
class syntaxStudent extends Student{

    void work(){
        System.out.println("Syntax students work the hardest");
    }
    void sleep(){
        System.out.println("Syntax students lose sleep");
    }
}
class collegeStudent extends Student{
    void workout(){
        System.out.println("College students workout");
    }
}
class schoolStudent extends Student{
     void playSports(){
         System.out.println("School students play sports");
     }
}