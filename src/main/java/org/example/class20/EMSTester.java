package org.example.class20;

public class EMSTester {
    public static void main(String[] args) {
        Employee [] ems={new FullTimeEmployee(), new PartTimeEmployee(),
                new Intern()};

        for (int i = 0; i < ems.length; i++) {
            Employee e=ems[i];
            e.calculateSalary(35*4);
            e.reportWork();
        }
    }
}