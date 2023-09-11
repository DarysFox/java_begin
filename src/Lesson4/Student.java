package Lesson4;

public class Student {
    int studNum;
    String name;
    String surname;
    int year;
    double srMarkMat;
    double srMarkEc;
    double srMarkJaz;
}

class StudentTest {
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.studNum = 1;
        stud1.name = "Bobin";
        stud1.surname = "Barambek";
        stud1.year = 2021;
        stud1.srMarkMat = 1.33;
        stud1.srMarkEc = 2.7;
        stud1.srMarkJaz = 1.04;

        Student stud2 = new Student();
        stud2.studNum = 2;
        stud2.name = "Gochta";
        stud2.surname = "Zhir";
        stud2.year = 2022;
        stud2.srMarkMat = 2.5;
        stud2.srMarkEc = 3.23;
        stud2.srMarkJaz = 1.0;

        Student stud3 = new Student();
        stud3.studNum = 3;
        stud3.name = "Puch";
        stud3.surname = "Pukin";
        stud3.year = 2023;
        stud3.srMarkMat = 1.08;
        stud3.srMarkEc = 2.78;
        stud3.srMarkJaz = 3.9;


        System.out.println("Stud num: " + stud1.studNum + "\n Name: " + stud1.name + "\n Surname: " +  stud1.surname + "\n Year: " + stud1.year +
                "\n Mat: " + stud1.srMarkMat + "\n Ec: " + stud1.srMarkEc + "\n Jaz: " + stud1.srMarkJaz);

        System.out.println();

        System.out.println("Stud num: " + stud2.studNum + "\n Name: " + stud2.name + "\n Surname: " +  stud2.surname + "\n Year: " + stud2.year +
                "\n Mat: " + stud2.srMarkMat + "\n Ec: " + stud2.srMarkEc + "\n Jaz: " + stud2.srMarkJaz);

        System.out.println();

        System.out.println("Stud num: " + stud3.studNum + "\n Name: " + stud3.name + "\n Surname: " +  stud3.surname + "\n Year: " + stud3.year +
                "\n Mat: " + stud3.srMarkMat + "\n Ec: " + stud3.srMarkEc + "\n Jaz: " + stud3.srMarkJaz);
    }
}