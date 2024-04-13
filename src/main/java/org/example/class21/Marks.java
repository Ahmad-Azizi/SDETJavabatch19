package org.example.class21;
/* We have to calculate the average of marks obtained
    in three subjects by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage'
    that will be returning the average of marks. Provide implementation
    of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects
    as its parameters and the  marks in four subjects as
    its parameters for student B

     */
abstract class Marks {

    public abstract double getAverage();

}
class A extends Marks{
     double english;
     double history;
     double math;

    public A(double english, double history,double math){
        this.english=english;
        this.history=history;
        this.math=math;
    }

    @Override
    public double getAverage(){
        return (english+history+math)/3;

    }

}
class B extends Marks{
    double science;
    double business;
    double spanish;
    double music;

    public  B(double science, double business,double spanish, double music){
        this.science=science;
        this.business=business;
        this.spanish=spanish;
        this.music=music;
    }
    @Override
    public double getAverage(){
        return (science+business+spanish+music)/4;
    }
}
