package org.example.class21;



public interface Human {
    void walk(String s);
}
interface Person extends Human{
    void speak();
}
interface Employee extends Person{

    void work();
}
class SyntaxEmployee implements Employee{

    @Override
    public void walk(String s) {
        System.out.println("Employee walking");
    }

    @Override
    public void speak() {
        System.out.println("Employee Speaking");
    }

    @Override
    public void work() {

        System.out.println("Employee Working");
    }
}
