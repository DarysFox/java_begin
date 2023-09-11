package Lesson30;

import java.util.ArrayList;

public class Test30_2 {

}

class Student1{
    String name;
    char gender;
    int age;
    int course;
    double avGrade;

    Student1(String name, char gender, int age, int course, double avGrade){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }
}

class Student1Info{
    void printStudent(Student st){
        System.out.println("Imya studenta: " + st.name + ", pol: " + st.gender + ", vozrast: " + st.age +
                ", kurs: " + st.course + ", srednya ocenka: " + st.avGrade);
    }

    void testStudents(ArrayList <Student> aL, StudentChecks sc){
        for(Student s : aL){
            if(sc.testStudent(s)){
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
        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
        FindStudentsByGender fsbg = new FindStudentsByGender();
        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();

        //si.testStudents(list, (Student st) -> {return st.avGrade > 8.5;});
        System.out.println("----------------------------------------------------------------");
    }
}

interface StudentChecks{
    boolean testStudent(Student s);
}

class FindStudentsOverGrade implements StudentChecks{
    public boolean testStudent(Student s) {
        return s.avGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentChecks{
    public boolean testStudent(Student s) {
        return s.avGrade < 9;
    }
}

class FindStudentsOverAge implements StudentChecks{
    public boolean testStudent(Student s) {
        return s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentChecks{
    public boolean testStudent(Student s) {
        return s.age < 27;
    }
}

class FindStudentsByGender implements StudentChecks{
    public boolean testStudent(Student s) {
        return s.gender == 'm';
    }
}

class FindStudentsMixCondition implements StudentChecks{
    public boolean testStudent(Student s) {
        return (s.avGrade > 7.2 && s.age < 23 && s.gender == 'm');
    }
}