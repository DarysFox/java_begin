package Lesson23;

public class Test23_3 {

    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        Teacher1 t = new Teacher1();
       // emp.sleep();
        t.sleep();
        Employee1 e = new Teacher1();
    }
}
class Eda{}
class Frukti extends Eda{}

class Employee1{
    double salary = 100;
    String name = "Kolya";

    public Eda eat(){
        System.out.println("Kushaet robotnik");
        Eda e = new Eda();
        return e;
    }

    private void sleep(){
        System.out.println("Spit rabotnik");
    }
}

class Teacher1 extends Employee1{

    public Eda eat(){
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

    int kolichestvoUchenikov;

    void uchit(){
        System.out.println("Uchit");
    }

    public void sleep(){
        System.out.println("Spit ucitel");
    }
}