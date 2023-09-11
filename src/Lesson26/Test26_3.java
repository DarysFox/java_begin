package Lesson26;

public class Test26_3 {
    Test26_3(){
        System.out.println("Eto konstruktor");
    }

    {
        System.out.println("Eto init block");
    }

    public static void main(String[] args) {
        Test26_3 t1 = new Test26_3();
        Test26_3 t2 = new Test26_3();
    }
}
