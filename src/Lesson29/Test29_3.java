package Lesson29;

import java.time.*;

public class Test29_3 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
        LocalTime lt = LocalTime.of(10,30);
        Period p = Period.ofMonths(3);

        Duration d = Duration.ofMinutes(3);
        System.out.println(ldt.plus(d).plus(p));
    }
}
