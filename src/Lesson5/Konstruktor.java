package Lesson5;

public class Konstruktor {

    int summa(int a, int b, int c){
        int result = a + b + c;
        return result;
    }

    int sredneeArifm(int a1, int b1, int c1){
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}

class TestKon{

    public static void main(String[] args){
        Konstruktor t = new Konstruktor();
        t.summa(1, 2, 3);
        int summaTrexChisel = t.summa(1, 2, 3);
        System.out.println(summaTrexChisel);

        System.out.println(t.sredneeArifm(20, 40, 60));
    }
}