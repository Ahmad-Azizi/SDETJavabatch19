package org.example.class18;

public class Task1 {
    public int minNum(int a,int b){
        return a > b ? b : a;
    }
    public double minNum(double a,double b){
     return Math.min(a,b);
    }

}


class Task1Tester{
    public static void main(String[] args) {
        Task1 num=new Task1();
        System.out.println(num.minNum(15,25));
    }
}
