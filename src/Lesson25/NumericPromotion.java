package Lesson25;

import javax.crypto.spec.PSource;

public class NumericPromotion {
    public static void main(String[] args) {
        int i = 5;
        long l = 10;
        i *= l;
        System.out.println(i + l);

        float f = 3.14f;
        int i2 = 10;
        System.out.println(f + i2);

        byte b = 3;
        short s = 4;
        char c = 5;
        System.out.println(b + s + c);
        System.out.println(b++);

        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.0;
        System.out.println(b2 + f2 - d2);
    }
}
