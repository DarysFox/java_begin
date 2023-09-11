package Lesson25;

import Lesson11.Em;

public class Test25 {

    public static void main(String[] args) {

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        helpAble h = new Teacher();

        Doctor d1 = (Doctor) emp1;
        System.out.println(d1.special);

        //Employee [] array2 = {emp1, emp2, emp3};

        //System.out.println(emp1 instanceof Teacher);

        //Driver [] array1 = {new Driver(), new Driver()};
        //Employee [] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        //helpAble [] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

       // emp1.work();
       // emp2.work();
       // emp3.work();

        /*for(Employee emp : array2){
            emp.work();
        }
         */
    }
}

abstract class Employee{
    void sleep(){
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements helpAble{
    public void help(){
        System.out.println("Teacher helps");
    }
    void work(){
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements helpAble{
    public void help(){
        System.out.println("Driver helps");
    }
    void work(){
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements helpAble{
    String special = "chirurg";

    public void help(){
        System.out.println("Doctor helps");
    }
    void work(){
        System.out.println("Doctor works");
    }
}

interface helpAble{
    void help();
}