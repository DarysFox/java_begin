package Lesson22;

public class Chelovek {

    public String name = "Kyle";
    static int salary = 150;
    void work(){
        System.out.println("work");
    }

    public static void rest(){
        System.out.println("rest");
    }
}

class Student extends Chelovek{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}