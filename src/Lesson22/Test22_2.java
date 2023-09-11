package Lesson22;

public class Test22_2 {

}

class Human2 {
    Human2(){}
 /*   Human2(String n) {
        this(n, null);
    }

    Human2(String n, String s){
        name = n;
        surname = s;
    }
*/
    String name = "Poul";
    String surname = "Benet";

class Student2 extends Human2{
    Student2(){
        super();
    }
    public void main(String[] args) {
        Student2 s = new Student2();
    }
}
}
