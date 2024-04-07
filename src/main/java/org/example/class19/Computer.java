package org.example.class19;

public class Computer {

    void storeData(){
        System.out.println("Stores data");
    }
    void runSoftware(){
        System.out.println("Run different softwares");
    }

    void operatingSys(){
        System.out.println("Computer could have different softwares");
    }


}
class Apple extends Computer{
    void operatingSys(){
        System.out.println("Mac OS");
    }
    void runSoftware(){
        System.out.println("Run different  Mac supported softwares");
    }
}

class Lenovo extends Computer{
    void operatingSys(){
        System.out.println("Windows OS");
    }
    void runSoftware(){
        System.out.println("Run different Windows supported softwares");
    }
}

class HP extends Computer{
    void operatingSys(){
        System.out.println("Linux OS");
    }
    void runSoftware(){
        System.out.println("Run different Linux supported softwares");
    }
}

class Dell extends Computer{
    void operatingSys(){
        System.out.println("Windows OS");
    }
    void runSoftware(){
        System.out.println("Run different Windows supported softwares");
    }
}
 class ComputerTester {
    public static void main(String[] args) {
        Computer [] comp={new Apple(), new Dell(), new Lenovo(), new HP()};

        for (int i = 0; i < comp.length; i++) {
            Computer c=comp[i];
            c.operatingSys();
            c.runSoftware();
            c.storeData();
        }
    }
}