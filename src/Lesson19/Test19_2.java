package Lesson19;

public class Test19_2 {

    public static void main(String[] args) {
        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"mat an", "filosof"};
        for(String s1 : students){
            for(String s2 : exams){
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
