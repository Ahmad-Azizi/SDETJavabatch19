package org.example.class21;

class WashAbleTester{

    public static void main(String[] args) {
        WashAble d=new Dog();
        d.wash();
        WashAble s=new Sofa();
        s.wash();

       WashAble[] things={new Dog(),new Sofa()};
        for (WashAble w:things) {
            w.wash();
        }

    }
}