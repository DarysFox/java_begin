package Lesson11;

public class St {
    String name;
    int course;
    double grade;

    St(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(St s1, St s2){
        St s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void changeName(St s1){
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        St st1 = new St("Bob", 3, 9.5);
        St st2 = new St("Nana", 5, 5.3);

        changeName(st2);
        System.out.println(st2.name);
    }
}
