package Lesson6;

public class MethodOv {

    public int sum(int i1, int i2){
        return i1 + i2;
    }

    public String sum(String s1, String s2){
        return s1 + s2;
    }
}

class MethodOvTest{
    public static void main(String[] args) {
        MethodOv mO2 = new MethodOv();

        int a = mO2.sum(5, 7);
        System.out.println(a);
        String s = mO2.sum("privet ", "zhir!");
        System.out.println(s);
    }
}