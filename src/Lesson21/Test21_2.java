package Lesson21;

public class Test21_2 {

    Test21_2(){
        System.out.println("This is constructor");
    }

    void Test21_2 (){
            System.out.println("This is method");
        }
}

class A{
    public static void main(String[] args) {
        Test21_2 t = new Test21_2();
    }
}