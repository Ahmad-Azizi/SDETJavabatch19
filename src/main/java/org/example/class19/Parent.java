package org.example.class19;

public  class Parent {

    private final String name="Albarran";

   void marry(){

        System.out.println("Marry the girl we chose for you");
    }
}
class Alex extends Parent{

    void marry(){
        super.marry();
        System.out.println("I want to Marry taylor swift");
    }

}

class ParentTester{
    public static void main(String[] args) {
        Alex c=new Alex();
        c.marry();
    }
}