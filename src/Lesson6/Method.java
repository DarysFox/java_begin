package Lesson6;

public class Method {

    void show(int i1){
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(int a, int b){
        System.out.println(a);
        System.out.println("Data type is int");
    }

    void show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }

    void show(String s, int a){
        System.out.println("String: " + s + "int: " + a);
    }

    void show(int a, String s){
        System.out.println("kakoy horoshiy den");
    }
}

class MethodTest{

    public static void main(String[] args){
        Method mO = new Method();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "privet";
        mO.show(s);
        mO.show(10, "boch");
    }
}