package Lesson30;

import java.util.ArrayList;

public class Test30 {

}

class Student{
    String name;
    char gender;
    int age;
    int course;
    double avGrade;

    Student(String name, char gender, int age, int course, double avGrade){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }
}

class StudentInfo{
    void printStudent(Student st){
        System.out.println("Imya studenta: " + st.name + ", pol: " + st.gender + ", vozrast: " + st.age +
                ", kurs: " + st.course + ", srednya ocenka: " + st.avGrade);
    }

    void printStudentsOverGrade(ArrayList <Student> aL, double avGrade){
        for(Student s : aL){
            if(s.avGrade > avGrade){
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList <Student> aL, double avGrade){
        for(Student s : aL){
            if(s.avGrade < avGrade){
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList <Student> aL, int age){
        for(Student s : aL){
            if(s.age > age){
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList <Student> aL, int age){
        for(Student s : aL){
            if(s.age < age){
                printStudent(s);
            }
        }
    }

    void printStudentsByGender(ArrayList <Student> aL, char gender){
        for(Student s : aL){
            if(s.gender > gender){
                printStudent(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList <Student> aL, double avGrade, int age, char gender){
        for(Student s : aL){
            if(s.avGrade > avGrade && s.age < age && s.gender == gender){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();

        si.printStudentsOverGrade(list, 8.5);
        System.out.println("--------------------------------------------------");

        si.printStudentsUnderGrade(list, 9);
        System.out.println("--------------------------------------------------");

        si.printStudentsOverAge(list, 25);
        System.out.println("--------------------------------------------------");

        si.printStudentsUnderAge(list, 27);
        System.out.println("--------------------------------------------------");

        si.printStudentsByGender(list, 'm');
        System.out.println("--------------------------------------------------");

        si.printStudentsMixCondition(list, 7.2, 23,'f');
    }
}


