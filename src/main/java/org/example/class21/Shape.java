package org.example.class21;

/*
Create an Interface 'Shape' with undefined methods as calculateArea
 and calculatePerimiter. Create 2 classes Circle & Square that implements
  functionality defined in the Shape Interface. Test your code.
 */
public interface Shape {
    void calculateArea(double r);
    void calculatePerimiter(double r);
}
class Circle implements Shape{
    @Override
    public void calculateArea(double r) {
        System.out.println(Math.PI*(r*r));
    }

    @Override
    public void calculatePerimiter(double r) {
        System.out.println(2*3.14*r);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea(double r) {
        System.out.println(r*r);
    }

    @Override
    public void calculatePerimiter(double r) {
        System.out.println(4*r);
    }
}