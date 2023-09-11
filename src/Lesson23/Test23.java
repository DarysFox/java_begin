package Lesson23;

public class Test23 {

    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
    }
}
class Employee extends java.lang.Object{

    double salary = 100;
    String name = "Jack";
    int age;
    int experience;


    void eat(){
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}

class Doctor extends Employee{
    void lechit(){
        System.out.println("Lechit");
    }
}
class Teacher extends Employee {
    int kolicestvoUcenikov;
    void uchit(){
        System.out.println("Uchit");
    }
}


class Driver extends Employee{
    String nayvanieMashiny;
    void vodit(){
        System.out.println("Vodit");
    }
}