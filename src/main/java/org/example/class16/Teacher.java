package org.example.class16;

public class Teacher {
    private String name;
    private String address;
    public Teacher(String name, String address){
     this.name=name;
     this.address=address;
    }
    void toPrintInfo(){
        System.out.println(name + " " +address);
    }
    public static void main(String[] args) {
        Teacher T1=new Teacher("Ashgar", "India");
            T1.toPrintInfo();
    }
}