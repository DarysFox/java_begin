package Lesson29;

import java.time.*;

public class Test29_2 {
    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2014, 5, 31);
        System.out.println(ld1);
        ld1 = ld1.minusYears(3);
        System.out.println(ld1);
    }
}
