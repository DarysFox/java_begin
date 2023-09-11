package Lesson29;

import java.time.*;
import java.time.format.*;

public class Test29_4 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40, 9);
        LocalTime lt = LocalTime.of(16, 40);

        DateTimeFormatter d1 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d1));
    }

}
