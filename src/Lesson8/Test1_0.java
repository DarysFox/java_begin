package Lesson8;

public class Test1_0 {

    public final int a = 10;


    public void abc(final short s){
        final byte b;
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1_0 t = new Test1_0();
        System.out.println(t.a);
    }
}
