package org.example.class17;

class Teacher {
    String name;
    int age;
    String subject;

    void display() {
        System.out.println(name + " " + age + " " + subject);
    }

    void teach() {
        System.out.println("Teaching");
    }

    void grade() {
        System.out.println("Grading");
    }

    void attendMeeting() {
        System.out.println("Attending meeting");
    }

    void prepareLesson() {
        System.out.println("Preparing lesson");
    }
}


 class MathTeacher extends Teacher {
    void teachMath() {
        System.out.println("Teaching Math");
    }
}

 class ChemistryTeacher extends Teacher {
    void teachChem() {
        System.out.println("Teaching Chemistry");
    }
}

 class PianoTeacher extends Teacher {
    void teachPiano() {
        System.out.println("Teaching Piano");
    }
}


public class Task3 {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.name = "John";
        obj.age = 30;
        obj.subject = "Math";
        obj.display();
        obj.teach();
        obj.grade();
        obj.attendMeeting();
        obj.prepareLesson();

        MathTeacher obj1 = new MathTeacher();
        obj1.name = "Mike";
        obj1.age = 25;
        obj1.subject = "Math";
        obj1.display();
        obj1.teachMath();
        obj1.grade();
        obj1.attendMeeting();
        obj1.prepareLesson();


}}