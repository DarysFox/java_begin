package Lesson22;

public class Test22 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ben";
        doc.age = 50;
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}

class Employee22{
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("eat");
    }

    void sleep(){
        System.out.println("sleep");
    }
}

class Doctor extends Employee22{
    void lechit(){
        System.out.println("lechit");
    }
}

class Chirurg extends Doctor{
    String skalpel;
    void operacia(){

    }
}

class Dentist extends Doctor{

}























class Teacher extends Employee22{
    int kolicestvoUcenikov;
    void ucit(){
        System.out.println("ucit");
    }
}


class Driver extends Employee22{
    String nayvanieMashiny;
    void vodit(){
        System.out.println("vodit");
    }
}
