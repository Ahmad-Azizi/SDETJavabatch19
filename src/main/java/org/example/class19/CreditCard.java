package org.example.class19;
/*
Create a class CreditCard Create an instance method that will
calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate
interest.
Call the method by creating an object of each of the three classes

 */
public class CreditCard {
    void calcInterest(double balance){
        System.out.println(balance*0.04);
    }
}
class Visa extends CreditCard{
}
class AX extends CreditCard{
    @Override void calcInterest(double balance) {
        System.out.println(balance*.05);
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        Visa v = new Visa();
        AX a = new AX();
        c.calcInterest(10000);
        v.calcInterest(10000);
        a.calcInterest(10000);
    }
}

