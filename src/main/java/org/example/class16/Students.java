package org.example.class16;

public class Students {

    private String studentName;
    private double grade1;
    private double grade2;
    private double grade3;

    public Students(String name, double eGrade1, double eGrade2, double eGrade3) {
        studentName = name;
        grade1 = eGrade1;
        grade2 = eGrade2;
        grade3 = eGrade3;
    }

    public double averageGrade() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public static void main(String[] args) {
        Students s1 = new Students("Will",0 , -50,0.0);
        Students s2 = new Students("Asghar", 105.0, 110.5, 99.0);
        System.out.println("Average mark for " + s1.studentName + ":" + s1.averageGrade());
        System.out.println("Average mark for " + s2.studentName + ":" + s2.averageGrade());
    }
}