package Lesson11;

import javax.swing.*;

public class Em {

    public String name;
    public double salary;

    Em(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a){
        a = a * 2;
        return  a;
    }

    public double zp2(){
        salary = salary*2;
        return salary;
    }
}

class EmTest{
    public static void main(String[] args) {
        Em em1 = new Em("Bob", 100.55);
        double d = em1.uvelichitel(em1.salary);
        System.out.println(d);
        System.out.println(em1.salary);
        em1.zp2();
        System.out.println(em1.salary);
    }
}